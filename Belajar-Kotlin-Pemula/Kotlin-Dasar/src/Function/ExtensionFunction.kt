package Function

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Niam"

    println(name.hello())

    name.printHello()

    "Miftakun".printHello()
}