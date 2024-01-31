package function

fun hello(firstName: String, lastName : String? = null){
    if(lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Nia")
    hello("Eko", "Niam")
    hello("Eko", null)
    hello("Budi", "nia")


}