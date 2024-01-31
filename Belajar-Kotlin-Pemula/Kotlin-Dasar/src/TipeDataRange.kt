fun main() {

    //val range = 1..100 dan step
    val range = 100 downTo 1 step 2

    println(range.count())
    println(range.contains(50))
    println(range.contains(150))
    println(range.first)
    println(range.last)
    println(range.step)




}