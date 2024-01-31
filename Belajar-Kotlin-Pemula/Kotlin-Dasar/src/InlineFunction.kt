
inline fun hello(firstName: () -> String,
                noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    //println(hello { "Mifta" })
   // println(hello{ "Syifa" })

    for (i in 0..100) {
        println(hello({"Miftakun"},{"Niam"}))
    }
}