package Function

//array
fun hitungTotal(vararg values: Int): Int { //harus di belakang
    var total = 0

    for (value in values) {
        total += value
    }
    return  total;
}

fun main() {
    //val values = arrayOf(18,10,10,10)
    val result = hitungTotal(10,20,10,10,19)

    println(result)
}