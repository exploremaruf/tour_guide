package com.example.tourguide

object DataSource {
    val places = listOf(
        Place(
            "Cox's Bazar",
            "World’s longest sea beach",
            "Cox's Bazar is famous for its long sandy beach stretching over 120 km. It is the most popular tourist destination in Bangladesh.",
            "https://images.pexels.com/photos/33684437/pexels-photo-33684437.jpeg",
            listOf(
                "https://images.pexels.com/photos/4090625/pexels-photo-4090625.jpeg",
                "https://images.pexels.com/photos/37053128/pexels-photo-37053128.jpeg"
            )
        ),

        Place(
            "Sundarbans",
            "Largest mangrove forest",
            "The Sundarbans is a UNESCO World Heritage Site and home of the Royal Bengal Tiger.",
            "https://images.pexels.com/photos/18974570/pexels-photo-18974570.jpeg",
            listOf(
                "https://images.pexels.com/photos/37561506/pexels-photo-37561506.jpeg",
                "https://media.istockphoto.com/id/1045841548/photo/tiger-drinking-water-from-river.jpg?b=1&s=612x612&w=0&k=20&c=soTEmk135nwrjApcMr2lDujyS-gB8YWYQR_FpA81-C0="
            )
        ),

        Place(
            "Sajek Valley",
            "Queen of Hills",
            "Sajek Valley is famous for clouds, hills, and natural beauty.",
            "https://images.pexels.com/photos/28672619/pexels-photo-28672619.jpeg",
            listOf(
                "https://images.pexels.com/photos/2852395/pexels-photo-2852395.jpeg",
                "https://images.pexels.com/photos/32268738/pexels-photo-32268738.jpeg"
            )
        ),



        Place(
            "Saint Martin",
            "Coral Island of Bangladesh",
            "Saint Martin is the only coral island in Bangladesh known for blue water and coconut trees.",
            "https://images.pexels.com/photos/7804706/pexels-photo-7804706.jpeg",
            listOf(
                "https://images.pexels.com/photos/33684437/pexels-photo-33684437.jpeg",
                "https://media.istockphoto.com/id/474259514/photo/boat-on-the-tropical-beach.jpg?b=1&s=612x612&w=0&k=20&c=AqUCBMoOe9dvp-CB9EPNYVEynYR3FjgPbB-YUJHriLU="
            )
        ),

        Place(
            "Bandarban",
            "Land of Hills",
            "Bandarban is famous for hills, waterfalls, and tribal culture.",
            "https://images.pexels.com/photos/9037375/pexels-photo-9037375.jpeg",
            listOf(
                "https://images.pexels.com/photos/37801969/pexels-photo-37801969.jpeg",
                "https://images.pexels.com/photos/2555800/pexels-photo-2555800.jpeg"
            )
        ),

        Place(
            "Rangamati",
            "Lake City",
            "Rangamati is known for Kaptai Lake and scenic hill views.",
            "https://images.pexels.com/photos/12977892/pexels-photo-12977892.jpeg",
            listOf(
                "https://images.pexels.com/photos/31730148/pexels-photo-31730148.jpeg",
                "https://images.pexels.com/photos/35385559/pexels-photo-35385559.jpeg"
            )
        ),

        Place(
            "Kuakata",
            "Daughter of the Sea",
            "Kuakata is famous for both sunrise and sunset views from the beach.",
            "https://images.pexels.com/photos/36368823/pexels-photo-36368823.jpeg",
            listOf(
                "https://images.pexels.com/photos/122107/pexels-photo-122107.jpeg",
                "https://images.pexels.com/photos/28424617/pexels-photo-28424617.jpeg"
            )
        ),

        Place(
            "Sylhet",
            "Tea Garden City",
            "Sylhet is popular for tea gardens, waterfalls, and natural beauty.",
            "https://images.pexels.com/photos/998903/pexels-photo-998903.jpeg",
            listOf(
                "https://images.pexels.com/photos/35458090/pexels-photo-35458090.jpeg",
                "https://images.pexels.com/photos/19102359/pexels-photo-19102359.jpeg"
            )
        ),

        Place(
            "Ratargul",
            "Swamp Forest",
            "Ratargul is the only freshwater swamp forest in Bangladesh.",
            "https://images.pexels.com/photos/4797376/pexels-photo-4797376.jpeg",
            listOf(
                "https://images.pexels.com/photos/35457230/pexels-photo-35457230.jpeg",
                "https://images.pexels.com/photos/5538929/pexels-photo-5538929.jpeg"
            )
        ),

        Place(
            "Jaflong",
            "Stone Collection Area",
            "Jaflong is known for hills, rivers, and stone collection activities.",
            "https://images.pexels.com/photos/33769041/pexels-photo-33769041.jpeg",
            listOf(
                "https://images.pexels.com/photos/128546/pexels-photo-128546.jpeg",
                "https://images.pexels.com/photos/36278276/pexels-photo-36278276.jpeg   "
            )
        ),

        Place(
            "Srimangal",
            "Tea Capital",
            "Srimangal is famous for tea gardens and seven-layer tea.",
            "https://images.pexels.com/photos/14672474/pexels-photo-14672474.jpeg",
            listOf(
                "https://images.pexels.com/photos/19726348/pexels-photo-19726348.jpeg",
                "https://images.pexels.com/photos/36964491/pexels-photo-36964491.jpeg"
            )
        ),

        Place(
            "Mahasthangarh",
            "Ancient City",
            "Mahasthangarh is one of the oldest archaeological sites in Bangladesh.",
            "https://images.pexels.com/photos/35638212/pexels-photo-35638212.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/6/67/Mahasthangarh.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/29/Mahasthangarh_Ruins.jpg"
            )
        ),

        Place(
            "Paharpur",
            "Buddhist Monastery",
            "Paharpur is a UNESCO World Heritage Site with ancient Buddhist ruins.",
            "https://www.pexels.com/photo/serene-view-of-chaukhandi-stupa-in-varanasi-35729428/",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/f/f4/Somapura_Mahavihara.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/73/Paharpur_Ruins.jpg"
            )
        ),

        Place(
            "Lalbagh Fort",
            "Mughal Fort",
            "Lalbagh Fort is a historic Mughal fort complex in Dhaka.",
            "https://images.pexels.com/photos/34957297/pexels-photo-34957297.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Lalbagh_Fort_Dhaka.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/4/42/Lalbagh_Inside.jpg"
            )
        ),

        Place(
            "Ahsan Manzil",
            "Pink Palace",
            "Ahsan Manzil was the residence of the Nawab of Dhaka.",
            "https://images.pexels.com/photos/37886915/pexels-photo-37886915.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/3d/Ahsan_Manzil.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/a/a4/Ahsan_Manzil_Night.jpg"
            )
        ),

        Place(
            "Sonargaon",
            "Ancient Capital",
            "Sonargaon was an old capital of Bengal with rich history.",
            "https://images.pexels.com/photos/9711952/pexels-photo-9711952.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/4/4f/Panam_City.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/2e/Sonargaon_Museum.jpg"
            )
        ),

        Place(
            "Bagerhat",
            "Mosque City",
            "Bagerhat is famous for the historic Sixty Dome Mosque.",
            "https://www.pexels.com/photo/historic-brick-building-in-lush-setting-35456805/",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/9/9e/Sixty_Dome_Mosque.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Bagerhat_Mosque.jpg"
            )
        ),

        Place(
            "Tanguar Haor",
            "Wetland Paradise",
            "Tanguar Haor is known for migratory birds and beautiful wetlands.",
            "https://images.pexels.com/photos/29545963/pexels-photo-29545963.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/31/Tanguar_Haor.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/9a/Tanguar_Boat.jpg"
            )
        ),

        Place(
            "Nijhum Dwip",
            "Island of Deer",
            "Nijhum Dwip is famous for mangroves and spotted deer.",
            "https://images.pexels.com/photos/36472127/pexels-photo-36472127.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/8/8d/Nijhum_Dwip.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/1a/Nijhum_Deer.jpg"
            )
        ),

        Place(
            "Bisnakandi",
            "Stone River Area",
            "Bisnakandi is popular for crystal-clear water and stones.",
            "https://images.pexels.com/photos/1633318/pexels-photo-1633318.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/0/0e/Bisnakandi.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Bisnakandi_River.jpg"
            )
        ),

        Place(
            "Sitakunda",
            "Chandranath Hills",
            "Sitakunda is known for eco parks, hills, and waterfalls.",
            "https://images.pexels.com/photos/34017586/pexels-photo-34017586.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/34/Sitakunda_Eco_Park.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/8/84/Chandranath_Hill.jpg"
            )
        ),

        Place(
            "Lawachara",
            "Rain Forest",
            "Lawachara National Park is famous for wildlife and forests.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Life_around_jungle.jpg/330px-Life_around_jungle.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Lawachara_Forest.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/4/49/Lawachara_Trail.jpg"
            )
        ),

        Place(
            "Mainamati",
            "Ancient Buddhist Site",
            "Mainamati contains ancient Buddhist archaeological remains.",
            "https://images.pexels.com/photos/18916877/pexels-photo-18916877.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/a/a5/Mainamati_Ruins.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/55/Mainamati_Museum.jpg"
            )
        ),

        Place(
            "Patenga Beach",
            "Beach Near Chittagong",
            "Patenga Beach is a popular tourist spot near Chittagong city.",
            "https://images.pexels.com/photos/28383724/pexels-photo-28383724.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/0/Hakaluki08/Patenga_Beach.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Patenga_Sunset.jpg"
            )
        ),

        Place(
            "Hakaluki Haor",
            "Bird Sanctuary",
            "Hakaluki Haor is one of the largest marsh wetlands in Bangladesh.",
            "https://images.pexels.com/photos/18828264/pexels-photo-18828264.jpeg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/e/e2/Hakaluki_Haor.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/90/Hakaluki_Birds.jpg"
            )
        )
    )
}