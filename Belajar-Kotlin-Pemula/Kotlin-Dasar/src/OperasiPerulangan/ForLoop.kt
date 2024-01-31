package OperasiPerulangan

//for loop in array
fun main() {

    var array = arrayOf("Miftakun","Niam","Skom")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    //for range
    for (i in 0..100 step 2){
        println(i)
    }

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println("index $i = ${array.get(i)}")
    }

}