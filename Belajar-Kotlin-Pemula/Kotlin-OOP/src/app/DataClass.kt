package src.app

import src.data.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")

    val product2 = product.copy(name = "Supermie")

    println(product2)
    println(product)
}