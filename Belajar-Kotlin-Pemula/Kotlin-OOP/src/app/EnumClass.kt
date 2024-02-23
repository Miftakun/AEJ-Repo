package src.app

import src.data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders.toList())

    man.showDescription()
    woman.showDescription()
}