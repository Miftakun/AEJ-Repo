package Function

fun fullName(
    firstName:String,
    middleName:String,
    lastName: String,
    ){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Eko","kurniawan", "Kannedy")
    fullName(
        lastName = "Khannedy",
         firstName = "Eko",
        middleName = "Kurniawan"
    )


}