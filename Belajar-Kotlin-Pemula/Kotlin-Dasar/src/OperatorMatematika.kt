fun main() {

    val result = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    // Augmented Assignments Operation
    var total : Int = 0

    val barang1 = 100
    total += barang1 // total = total + barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    //Unary Operator
    total++ //total = total + 1
    total-- //total = total - 1

    val suhu = 5 // unary default operator +
    println(suhu)

    val suhu2 = -5 // unary operator -
    println(suhu2)

    val sehat = true
    println(!sehat) // unary operator ! kebalikan

}