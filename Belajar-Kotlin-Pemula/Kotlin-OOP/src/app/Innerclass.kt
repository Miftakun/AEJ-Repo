package src.app

import src.data.Boss
import src.data.Employee

fun main() {
    val boss1 = Boss("Mifta")
    val employee1 = boss1.Employee("Rudi")
    val employee2 = boss1.Employee("Joko")

    val boss2 = Boss("Pai")
    val employee3 = boss2.Employee("Budi")
    val employee4 = boss2.Employee("gunar")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}