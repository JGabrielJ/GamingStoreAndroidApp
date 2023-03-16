package com.acxdev.prototypegaming.model

data class Game(val name: Int, val genre: Int, val logo: Int? = null, val desc: Int, val image: Int, val price: Double? = null, val imageList: MutableList<Int>)