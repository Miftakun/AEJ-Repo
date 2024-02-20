package src.app

import src.data.Student
import src.data.sayHello
import src.data.upperName

fun main() {
    val student = Student("Niam", 24)
    student.sayHello("Mifta")
    println(student?.upperName)
}