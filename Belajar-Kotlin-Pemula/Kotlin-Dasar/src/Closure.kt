/*
Note:
Gunakan Closure ini dengan bijak
dan harus hati hati, karena bisa mengubah
data orang lain atau data yang lainnhya
secara tidak sengaja
 */

fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }
    val anonymousIncrement =fun(){
        println("Anonymous Function Increment")
        counter++

    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}