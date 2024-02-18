package src.app

import src.data.SuperTeacher
import src.data.Teacher

fun main() {
    val teacher = SuperTeacher("Niam")
    println(teacher.name)
    teacher.test()
}