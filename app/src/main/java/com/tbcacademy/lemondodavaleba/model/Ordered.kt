package com.tbcacademy.lemondodavaleba.model

data class Ordered(
    val number: Int,
    val dishName: String,
    val destination: String,
    val quantity: Int,
    val price: Double,
    val deliveryTime: Int,
    val preparationTimeSec: Int

)
