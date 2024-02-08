package src.app

import src.data.HandPhone
import src.data.Laptop

fun printObject(any: Any) {
    println(any)
}
fun main() {
    printObject("Niam")
    printObject(1)
    printObject(HandPhone("Samsung"))
    printObject(Laptop("Acer"))

}