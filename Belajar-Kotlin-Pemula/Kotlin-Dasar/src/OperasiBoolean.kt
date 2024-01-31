fun main() {

    // Operasi Boolean &&
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 70

    val jikaLulusUjian = nilaiUjian > 75
    val jikaLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 60

    val apakahLulus = jikaLulusUjian && jikaLulusAbsen && apakahLulusExtra
    //val apakahLulus = ((jikaLulusUjian && jikaLulusAbsen) && (apakahLulusExtra)
    println(apakahLulus)

}