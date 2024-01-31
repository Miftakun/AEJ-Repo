fun toUpper(value: String): String = value.uppercase()

fun main() {

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Miftakun","Niam")
    println(result)

    //lambda for it
    val sayHello: (String) -> String = {
        "hello $it"
    }
    println(sayHello("Niam"))

    //Method or functiop referances
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Miftakun Niam"))

}