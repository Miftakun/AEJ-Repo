package src.app

import src.data.BigNote
import src.data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}


