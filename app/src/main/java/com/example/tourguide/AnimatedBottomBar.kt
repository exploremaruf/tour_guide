package com.example.tourguide

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.animation.ValueAnimator
import androidx.core.view.doOnLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.view.animation.DecelerateInterpolator

class AnimatedBottomBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : BottomNavigationView(context, attrs, defStyleAttr) {

    private val path = Path()
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#1E3A8A")
    }

    private var targetX = 0f
    private var currentX = 0f
    private var animator: ValueAnimator? = null

    init {
        // Required so onDraw() actually gets called on a ViewGroup
        setWillNotDraw(false)

        // Remove standard M3 background tints and indicators
        setBackgroundColor(Color.TRANSPARENT)
        setItemActiveIndicatorColor(android.content.res.ColorStateList.valueOf(Color.TRANSPARENT))

        // Listen for item selection transitions
        setOnItemSelectedListener { item ->
            val itemWidth = width / menu.size()

            // Dynamically find which index was clicked (0, 1, 2, etc.)
            val itemIndex = (0 until menu.size()).firstOrNull { menu.getItem(it).itemId == item.itemId } ?: 0

            // Animate the organic wave bump to the center of the clicked icon
            animateBump(itemIndex * itemWidth + (itemWidth / 2f))
            true
        }

        // Initialize the bump position on the first item once laid out
        doOnLayout {
            val itemWidth = width / menu.size()
            animateBump(itemWidth / 2f, immediate = true)
        }
    }

    private fun animateBump(toX: Float, immediate: Boolean = false) {
        if (immediate) {
            currentX = toX
            invalidate()
            return
        }

        animator?.cancel()
        animator = ValueAnimator.ofFloat(currentX, toX).apply {
            duration = 350
            interpolator = DecelerateInterpolator(1.5f)
            addUpdateListener {
                currentX = it.animatedValue as Float
                invalidate()
            }
            start()
        }
    }

    override fun onDraw(canvas: Canvas) {
        val cornerRadius = 0f // Rounded bar edges
        val bumpWidth = 240f   // Total width of the wave shape
        val bumpHeight = 45f   // How high the wave pops up

        path.reset()

        // 1. Start top-left
        path.moveTo(cornerRadius, bumpHeight)

        // 2. Draw the organic bump over the selected item
        path.lineTo(currentX - (bumpWidth / 2f) - 20f, bumpHeight)

        // Left curve into peak
        path.cubicTo(
            currentX - (bumpWidth / 4f), bumpHeight,
            currentX - (bumpWidth / 4f), 0f,
            currentX, 0f
        )
        // Right curve out of peak back to baseline
        path.cubicTo(
            currentX + (bumpWidth / 4f), 0f,
            currentX + (bumpWidth / 4f), bumpHeight,
            currentX + (bumpWidth / 2f) + 20f, bumpHeight
        )

        // 3. Complete the outer bounding box with rounded corners
        path.lineTo(width.toFloat() - cornerRadius, bumpHeight)
        path.quadTo(width.toFloat(), bumpHeight, width.toFloat(), bumpHeight + cornerRadius) // Top Right
        path.lineTo(width.toFloat(), height.toFloat() - cornerRadius)
        path.quadTo(width.toFloat(), height.toFloat(), width.toFloat() - cornerRadius, height.toFloat()) // Bottom Right
        path.lineTo(cornerRadius, height.toFloat())
        path.quadTo(0f, height.toFloat(), 0f, height.toFloat() - cornerRadius) // Bottom Left
        path.lineTo(0f, bumpHeight + cornerRadius)
        path.quadTo(0f, bumpHeight, cornerRadius, bumpHeight) // Top Left

        path.close()

        // Draw the background path
        canvas.drawPath(path, paint)

        super.onDraw(canvas)
    }
}