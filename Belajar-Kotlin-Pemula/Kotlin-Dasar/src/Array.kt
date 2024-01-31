fun main() {

    /*val members : Array<String> = arrayOf("Eko","Kurniawan","Khannedy")
    val eko : String = members[0]
    val kurniawan : String = members.get(1)
    val khannedy : String = members.get(2)

    members.set(0, "Amar")
    val amar: String = members[0]

     */

    // array nullabel
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Eko"
    members[1] = "Eko"
    members[2] = null
    members[3] = "Eko"
    members[4] = "Eko"
    println(members[2])

}