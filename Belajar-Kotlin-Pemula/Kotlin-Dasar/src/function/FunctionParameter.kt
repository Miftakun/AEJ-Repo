package function

fun sayHello(firsName : String, lastName : String?){
    if (lastName == null){
        println("Hello $firsName")
    }else{
        println("Hello $firsName $lastName")
    }
}

fun main() {
    sayHello("Miftakun", "Niam")
    sayHello("Putra", null)
    sayHello("Achmad", "Rifai")
}