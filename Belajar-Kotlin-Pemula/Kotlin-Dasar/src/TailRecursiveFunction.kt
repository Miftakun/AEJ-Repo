
fun main() {

    //Tail Recrusive error stuck overflow
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }
    //display(10000)

    //Tail Recursive Factorial Function solve
    tailrec fun factorialRecursive(value: Int, total:Int = 1): Int{
        return when(value){
            1 -> total
            else -> factorialRecursive(value - 1, total * value)

        }
    }
    println(factorialRecursive(10))
}