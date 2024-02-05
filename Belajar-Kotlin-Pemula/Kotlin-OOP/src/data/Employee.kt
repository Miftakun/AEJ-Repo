package src.data

open class Employee(val name: String) {
    open fun sayHello(name : String){
        println("Hello $name, My Name is ${this.name}")
    }
}

open class Manager(name: String) : Employee("Niam"){
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class SuperManager(name: String ) : Manager(name){
    //Error
//   override fun sayHello(name: String) {
//        println("Hello $name, My Name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice President ${this.name}")
    }
}