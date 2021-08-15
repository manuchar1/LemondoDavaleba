package com.tbcacademy.lemondodavaleba.model

data class NewOrder(
    val number: Int,
    val dishName: String,
    val destination: String,
    val quantity: Int,
    val price: Double,
    val progress: Int
)