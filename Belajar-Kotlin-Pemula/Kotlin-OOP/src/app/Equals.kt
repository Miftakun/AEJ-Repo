package src.app

import src.data.Company

fun main() {
    val company1 = Company("Niam")
    val company2 = Company("Elon Mask")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)

}