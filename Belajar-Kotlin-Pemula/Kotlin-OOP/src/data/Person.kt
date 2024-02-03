package src.data

/**
 * Function Overloading nama function boleh sama tetapi parameternya harus berbeda entah itu tipe data atau jumlah parameter
 */
class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(name: Int) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam, My Name is $lastNameParam, My Name is $firstName")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}