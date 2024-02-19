package src.data

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null)
    println("Hello $name. My name is ${this.name}, end my age is ${this.age}")
}
