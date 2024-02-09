package src.app

import src.data.HandPhone
import src.data.Laptop

fun printObject(any: Any) {
    if(any is Laptop){
        println("Laptop with name ${any.name}")
    }else if (any is HandPhone) {
        println("Handphone with name ${any.name}")
    }else{
        println(any)
    }
}
fun main() {
    printObject("Niam")
    printObject(1)
    printObject(HandPhone("Samsung"))
    printObject(Laptop("Acer"))

}