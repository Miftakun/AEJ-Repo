fun main() {

    fun sayHello(name: String= ""): String {
        return when(name){
            ""-> "Hello Brot!"
            else -> "Hello $name"
        }
//        return if (name == ""){
//        "Hello Bro"
//        }else{
//            "Hello $name"
//        }
    }
    println(sayHello())
    println(sayHello("Niam"))

}