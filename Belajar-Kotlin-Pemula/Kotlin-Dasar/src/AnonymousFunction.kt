import java.util.*

// Lambda cocok digunakan oleh kasus-kasus yang sederhana
// Anonymous Function cocok digunakan oleh kasus yang cukup kompleks

fun main() {

    fun hello(name: String, transfromer: (String) -> String): String {
        val nameTransform = transfromer(name)
        return "Hello $nameTransform"
    }

    //Anonymous Function
    val upper = fun(value:String): String {
        if (value == ""){
            return "UPS"
        }else{
            return value.uppercase()
        }
    }

    println(hello("Miftakun", upper))
    println(hello("", upper))

    println(hello("Niam", fun(value: String): String {
        return value.lowercase()
    }))

}