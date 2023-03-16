package com.example.myappforkotlin



data class Animal(
    val name: String,      // Ім'я тваринки
    val shortDesc: String, // Короткий опис тваринки (собака, кіт і тд.)
    val image_icon: Int,   // Картинка на картці
    val fullDesc: String   // Опис в другому Activity
)
