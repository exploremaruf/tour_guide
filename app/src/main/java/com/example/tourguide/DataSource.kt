package com.example.tourguide

object DataSource {
    val places = listOf(
        Place(
            "Cox's Bazar",
            "World’s longest sea beach",
            "Cox's Bazar is famous for its long sandy beach stretching over 120 km. It is the most popular tourist destination in Bangladesh.",
            "https://upload.wikimedia.org/wikipedia/commons/6/6e/Cox%27s_Bazar_sea_beach.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/6/6e/Cox%27s_Bazar_sea_beach.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/15/Cox%27s_Bazar_beach_sunset.jpg"
            )
        ),

        Place(
            "Sundarbans",
            "Largest mangrove forest",
            "The Sundarbans is a UNESCO World Heritage Site and home of the Royal Bengal Tiger.",
            "https://upload.wikimedia.org/wikipedia/commons/8/8f/Sundarbans_mangrove_forest.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/8/8f/Sundarbans_mangrove_forest.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/5a/Bengal_tiger_in_Sundarbans.jpg"
            )
        ),

        Place(
            "Sajek Valley",
            "Queen of Hills",
            "Sajek Valley is famous for clouds, hills, and natural beauty.",
            "https://upload.wikimedia.org/wikipedia/commons/4/4d/Sajek_Valley_Bangladesh.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/4/4d/Sajek_Valley_Bangladesh.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/2c/Sajek_clouds.jpg"
            )
        ),

        // 20 More Places

        Place(
            "Saint Martin",
            "Coral Island of Bangladesh",
            "Saint Martin is the only coral island in Bangladesh known for blue water and coconut trees.",
            "https://upload.wikimedia.org/wikipedia/commons/9/99/St_Martin_Island.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/9/99/St_Martin_Island.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/56/Saint_Martin_Beach.jpg"
            )
        ),

        Place(
            "Bandarban",
            "Land of Hills",
            "Bandarban is famous for hills, waterfalls, and tribal culture.",
            "https://upload.wikimedia.org/wikipedia/commons/3/37/Bandarban_Hills.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/37/Bandarban_Hills.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/28/Nafakhum_Waterfall.jpg"
            )
        ),

        Place(
            "Rangamati",
            "Lake City",
            "Rangamati is known for Kaptai Lake and scenic hill views.",
            "https://upload.wikimedia.org/wikipedia/commons/0/0c/Kaptai_Lake.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/0/0c/Kaptai_Lake.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/8/82/Rangamati_Hanging_Bridge.jpg"
            )
        ),

        Place(
            "Kuakata",
            "Daughter of the Sea",
            "Kuakata is famous for both sunrise and sunset views from the beach.",
            "https://upload.wikimedia.org/wikipedia/commons/b/b6/Kuakata_Beach.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/b/b6/Kuakata_Beach.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/4/4a/Kuakata_Sunset.jpg"
            )
        ),

        Place(
            "Sylhet",
            "Tea Garden City",
            "Sylhet is popular for tea gardens, waterfalls, and natural beauty.",
            "https://upload.wikimedia.org/wikipedia/commons/3/36/Sylhet_Tea_Garden.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/36/Sylhet_Tea_Garden.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/11/Ratargul_Swamp_Forest.jpg"
            )
        ),

        Place(
            "Ratargul",
            "Swamp Forest",
            "Ratargul is the only freshwater swamp forest in Bangladesh.",
            "https://upload.wikimedia.org/wikipedia/commons/1/11/Ratargul_Swamp_Forest.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/1/11/Ratargul_Swamp_Forest.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/70/Ratargul_Boat.jpg"
            )
        ),

        Place(
            "Jaflong",
            "Stone Collection Area",
            "Jaflong is known for hills, rivers, and stone collection activities.",
            "https://upload.wikimedia.org/wikipedia/commons/5/5d/Jaflong_Sylhet.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/5/5d/Jaflong_Sylhet.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/79/Jaflong_River.jpg"
            )
        ),

        Place(
            "Srimangal",
            "Tea Capital",
            "Srimangal is famous for tea gardens and seven-layer tea.",
            "https://upload.wikimedia.org/wikipedia/commons/2/20/Sreemangal_Tea_Garden.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/2/20/Sreemangal_Tea_Garden.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Lawachara_Forest.jpg"
            )
        ),

        Place(
            "Mahasthangarh",
            "Ancient City",
            "Mahasthangarh is one of the oldest archaeological sites in Bangladesh.",
            "https://upload.wikimedia.org/wikipedia/commons/6/67/Mahasthangarh.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/6/67/Mahasthangarh.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/29/Mahasthangarh_Ruins.jpg"
            )
        ),

        Place(
            "Paharpur",
            "Buddhist Monastery",
            "Paharpur is a UNESCO World Heritage Site with ancient Buddhist ruins.",
            "https://upload.wikimedia.org/wikipedia/commons/f/f4/Somapura_Mahavihara.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/f/f4/Somapura_Mahavihara.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/73/Paharpur_Ruins.jpg"
            )
        ),

        Place(
            "Lalbagh Fort",
            "Mughal Fort",
            "Lalbagh Fort is a historic Mughal fort complex in Dhaka.",
            "https://upload.wikimedia.org/wikipedia/commons/d/d3/Lalbagh_Fort_Dhaka.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Lalbagh_Fort_Dhaka.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/4/42/Lalbagh_Inside.jpg"
            )
        ),

        Place(
            "Ahsan Manzil",
            "Pink Palace",
            "Ahsan Manzil was the residence of the Nawab of Dhaka.",
            "https://upload.wikimedia.org/wikipedia/commons/3/3d/Ahsan_Manzil.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/3d/Ahsan_Manzil.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/a/a4/Ahsan_Manzil_Night.jpg"
            )
        ),

        Place(
            "Sonargaon",
            "Ancient Capital",
            "Sonargaon was an old capital of Bengal with rich history.",
            "https://upload.wikimedia.org/wikipedia/commons/4/4f/Panam_City.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/4/4f/Panam_City.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/2e/Sonargaon_Museum.jpg"
            )
        ),

        Place(
            "Bagerhat",
            "Mosque City",
            "Bagerhat is famous for the historic Sixty Dome Mosque.",
            "https://upload.wikimedia.org/wikipedia/commons/9/9e/Sixty_Dome_Mosque.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/9/9e/Sixty_Dome_Mosque.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/f/f0/Bagerhat_Mosque.jpg"
            )
        ),

        Place(
            "Tanguar Haor",
            "Wetland Paradise",
            "Tanguar Haor is known for migratory birds and beautiful wetlands.",
            "https://upload.wikimedia.org/wikipedia/commons/3/31/Tanguar_Haor.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/31/Tanguar_Haor.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/9a/Tanguar_Boat.jpg"
            )
        ),

        Place(
            "Nijhum Dwip",
            "Island of Deer",
            "Nijhum Dwip is famous for mangroves and spotted deer.",
            "https://upload.wikimedia.org/wikipedia/commons/8/8d/Nijhum_Dwip.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/8/8d/Nijhum_Dwip.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/1a/Nijhum_Deer.jpg"
            )
        ),

        Place(
            "Bisnakandi",
            "Stone River Area",
            "Bisnakandi is popular for crystal-clear water and stones.",
            "https://upload.wikimedia.org/wikipedia/commons/0/0e/Bisnakandi.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/0/0e/Bisnakandi.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Bisnakandi_River.jpg"
            )
        ),

        Place(
            "Sitakunda",
            "Chandranath Hills",
            "Sitakunda is known for eco parks, hills, and waterfalls.",
            "https://upload.wikimedia.org/wikipedia/commons/3/34/Sitakunda_Eco_Park.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/34/Sitakunda_Eco_Park.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/8/84/Chandranath_Hill.jpg"
            )
        ),

        Place(
            "Lawachara",
            "Rain Forest",
            "Lawachara National Park is famous for wildlife and forests.",
            "https://upload.wikimedia.org/wikipedia/commons/6/63/Lawachara_Forest.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Lawachara_Forest.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/4/49/Lawachara_Trail.jpg"
            )
        ),

        Place(
            "Mainamati",
            "Ancient Buddhist Site",
            "Mainamati contains ancient Buddhist archaeological remains.",
            "https://upload.wikimedia.org/wikipedia/commons/a/a5/Mainamati_Ruins.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/a/a5/Mainamati_Ruins.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/55/Mainamati_Museum.jpg"
            )
        ),

        Place(
            "Patenga Beach",
            "Beach Near Chittagong",
            "Patenga Beach is a popular tourist spot near Chittagong city.",
            "https://upload.wikimedia.org/wikipedia/commons/0/08/Patenga_Beach.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/0/08/Patenga_Beach.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Patenga_Sunset.jpg"
            )
        ),

        Place(
            "Hakaluki Haor",
            "Bird Sanctuary",
            "Hakaluki Haor is one of the largest marsh wetlands in Bangladesh.",
            "https://upload.wikimedia.org/wikipedia/commons/e/e2/Hakaluki_Haor.jpg",
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/e/e2/Hakaluki_Haor.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/90/Hakaluki_Birds.jpg"
            )
        )
    )
}