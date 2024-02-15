package src.app

import src.data.Television

fun main() {
    val tv = Television()
    tv.brand = "Samsung"
    tv.initTelevision("Samsung")
    println(tv.brand)
}