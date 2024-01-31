import java.util.*

fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {    //Note: lambda expression harus dipaling akhir expressionnya
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.uppercase() }
    println(hello("Miftakun", lambdaUpper))

    println(hello("Miftakun", { value: String -> value.lowercase() }))

    val result1 = hello("Miftakun", {value: String -> value.lowercase() }) // langsung didalam parameter
    val result2 = hello("Miftakun") {value: String -> // menggunakan trailing lambda (opsional)
        value.lowercase()
    }
}