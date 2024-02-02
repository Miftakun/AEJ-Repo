package src.data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    //Constructor no primary code
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            : this(paramStreet, paramCity){
         country = paramCountry
    }
}