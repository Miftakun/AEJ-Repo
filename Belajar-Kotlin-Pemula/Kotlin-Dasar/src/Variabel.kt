// variabel constant
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"


fun main(args: Array<String>) {

    var firstName = "Miftakun Niam"
    val age = 21

    println(firstName)
    println(age)

    //variabel null
    var name: String? = null
    name = "eko"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}