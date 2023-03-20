package com.judahben149.composechallenge.data

import com.judahben149.composechallenge.Dog
import com.judahben149.composechallenge.DogInfo
import com.judahben149.composechallenge.OwnerInfo
import com.judahben149.composechallenge.R

object FakeDogDatabase {

    val dogInfo = DogInfo(
        4.5,
        "Gold",
        23.4,
        R.drawable.blue_dog,
        "Looking for a loving owner who would treat me right and give me all the goodies that I deserve yeahhhh"
    )

    val ownerInfo = OwnerInfo(
        "Nancy Peter",
        "Dog mum and animal lover",
        R.drawable.red_dog
    )

    val dogList = listOf<Dog>(
        Dog(
            "Chunky",
            "312km",
            "23 mins",
            "Male",
            dogInfo,
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.white_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.red_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.yellow_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.orange_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.red_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.white_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.blue_dog),
            ownerInfo
        ),
        Dog(
            "Yippy",
            "435 km",
            "40 mins",
            "Female",
            dogInfo.copy(color = "Brown", weight = 20.2, imageUrl = R.drawable.yellow_dog),
            ownerInfo
        ),

    )
}