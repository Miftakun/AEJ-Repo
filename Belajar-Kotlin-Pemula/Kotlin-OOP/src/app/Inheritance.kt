package src.app

import src.data.Manager
import src.data.VicePresident

fun main() {
    val manager = Manager("Niam")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Niam")
}