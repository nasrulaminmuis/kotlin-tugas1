fun main() {
    print("Masukkan angka pertama: ")
    val angka1 = readLine()!!.toDouble()

    print("Masukkan operator (+,-,*,/): ")
    val operator = readLine()

    print("Masukkan angka kedua: ")
    val angka2 = readLine()!!.toDouble()

    val hasil: Double = when(operator) {
        "+" -> angka1 + angka2
        "-" -> angka1 - angka2
        "*" -> angka1 * angka2
        "/" -> angka1 / angka2
        else -> {
            println("Operator tidak dikenal")
            return
        }
    }

    println(" $angka1 $operator $angka2 = $hasil")
}
