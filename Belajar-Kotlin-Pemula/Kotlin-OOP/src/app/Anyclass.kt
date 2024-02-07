package src.app

import src.data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung A51", "Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}