package src.data

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

class Human(override val name: String): Interaction {
    override fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}