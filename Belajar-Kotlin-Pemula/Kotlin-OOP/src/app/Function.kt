package src.app

import src.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Miftakun"
    eko.middleName = "Niam"
    eko.lastName = "S.kom"

    eko.sayHello("Budi")
    eko.run()

    val fullName = eko.getFullName()
    println(fullName)

}