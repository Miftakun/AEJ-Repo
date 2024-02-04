package src.app

import src.data.Person

/**
 * direkomendasikan saat ingin mengakses properties objek itu sendiri
 * di function menggunakan kata kunci $(this.nama properties)
 * contoh di class Person
 */

fun main() {
    val eko = Person()
    eko.firstName = "Niam"

    eko.sayHello("Budi", "Nugraha")
}