package src.app

import src.data.Address

fun main() {
    val address1 = Address("jalan A", "Jakarta")
    val address2 = Address("Jalan B", "Semarang")

    println(address1.street)
    println(address2.street)

}