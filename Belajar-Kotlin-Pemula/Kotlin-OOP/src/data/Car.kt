package src.data

class Car(paramBrand: String, paramName: String, paramYear: Int = 2020) {  // This is Primary Constructor

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020){
        println("Secondary Constractor 1")
    }

    constructor(paramBrand: String): this(paramBrand,"") {
        println("Secondary Constractor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear

}