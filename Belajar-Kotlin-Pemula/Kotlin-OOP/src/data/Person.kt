package src.data

/**
 * Function Overloading nama function boleh sama tetapi parameternya harus berbeda entah itu tipe data atau jumlah parameter
 */
class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.firstName}")
    }

    fun sayHello(name: Int) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName, My Name is $lastName, My Name is ${this.firstName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}