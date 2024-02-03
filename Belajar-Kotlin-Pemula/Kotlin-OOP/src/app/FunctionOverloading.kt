package src.app

import src.data.Person

/**
 * Function Overloading nama function boleh sama tetapi parameternya harus berbeda entah itu tipe data atau jumlah parameter
 */

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    eko.sayHello("Budi")
    eko.sayHello("Joko", "Nugroho")
}