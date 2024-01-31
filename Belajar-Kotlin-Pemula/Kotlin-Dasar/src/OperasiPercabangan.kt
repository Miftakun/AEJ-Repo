fun main() {

    // if Expression
    /*
     if (kondisi boolean) {
        // jika kondisi bernilai true
        // maka isi blok if akan dieksekusi
     }
     */

    // else Expression
    /*
    if (kondisi boolena) {
        //jika kondisi bernilai true
        //maka isi blok if akan dieksekusi
    } else {
        //jika kondisi bernilai false
        //maka isi blok else akan dieksekusi
    }
     */

    // else if Expression
    /*
    if (kondisi boolean) {
        //jika kondisi 1 bernilai true
    } else if (kondisi boolean 2) {
        //jika kondisi 2 bernilai true
    } else {
        //jika kondisi bernilai false
    }
     */

    /*val nilai = 79

    if (nilai > 90){
        println("Cool")
    } else if (nilai > 75){
        println("Good Job")
    }else if (nilai >  60){
        println("not bad")
    }else {
        println("Tetap semangat coba lagi tahun depan")
    }

     */

    // when Expression
    var  nilai = "A"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try again next year")
        }
    }

    // when expression multiple option
    when (nilai){
        //if(nilai == "A" || nilai == "B" || nilai = "C")
        "A","B","C" -> {
            println("Selamat anda lulus")
        }else -> {
        println("Maaf anda tidak lulus")
        }
    }

    //when expression in
    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when(nilai) {
        in nilaiLulus -> println("Selamat anda LULUS")
        !in nilaiLulus -> println("Maaf, Tidak Lulus")
    }
    //when expression is
    val name = "Niam"
    when(name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    // when pengganti if else
    val nilaiUjian = 81
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang tahun depan")
    }
}