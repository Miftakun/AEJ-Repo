package src.app

import src.data.Application
import src.data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Miftakun"))
    a()
    b()

    println(Application.Utilities.toUpper("Miftakun"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}