fun main(args: Array<String>) {
    var firstName : String = "Miftakun "
    var secondName : String = "Niam"
    /*

    var address : String = """" 
        |Jln utan Jati no 117B,
        |Kalideres Jakarta Barat,
        |11840
        """.trimMargin()

    print(firstName)
    print(secondName)
    println(address)

     */

    //var fullName : String = firstName + " " + secondName

    //println(fullName)

    var fullName : String = "$firstName $secondName"
    println(fullName)

    var desc : String = "$fullName length ${fullName.length}"
    println(desc)

}