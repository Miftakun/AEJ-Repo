fun labelBreak(){
    loopI@ for (i in 1..100){
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue(){
    loopI@ for (i in 1..100){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}
fun main() {

    fun test(name:String, operataion:(String) -> Unit): Unit = operataion(name)

    test("Miftakun") test@ {
        if (it == ""){
            return@test
        }else{
            println("Mifta")
        }
    }
}