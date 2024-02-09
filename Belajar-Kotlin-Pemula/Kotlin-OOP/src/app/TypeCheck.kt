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

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

fun main() {
    printObjectWithWhen("Niam")
    printObjectWithWhen(1)
    printObjectWithWhen(HandPhone("Samsung"))
    printObjectWithWhen(Laptop("Acer"))

}