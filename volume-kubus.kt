// program menghitung volume kubus
fun main() {
    print("Masukkan sisi kubus: ")
    // konversi string ke double
    val sisi = readLine()!!.toDouble()
    val volume = sisi * sisi * sisi
    println("Volume kubus dengan sisi $sisi adalah $volume")
}
