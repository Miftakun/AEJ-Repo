package src.app

import src.data.Company

fun main() {
    val company1 = Company("Niam")
    val company2 = Company("Eko")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}