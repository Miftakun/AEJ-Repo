package src.data

import jdk.jfr.Description

enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("FEMALE");

    fun showDescription(){
        println(description)
    }
}