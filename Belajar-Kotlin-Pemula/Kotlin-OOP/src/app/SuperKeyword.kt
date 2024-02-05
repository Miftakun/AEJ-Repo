package src.app

import src.data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")

    rectangle.printName()
}