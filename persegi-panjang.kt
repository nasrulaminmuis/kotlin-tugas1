fun main() {
    print("Masukkan panjang: ")
    val panjang = readLine()!!.toDouble()
    print("Masukkan lebar: ")
    val lebar = readLine()!!.toDouble()
    val luas = panjang * lebar
    println("Luas persegi panjang dengan panjang $panjang dan lebar $lebar adalah $luas")
}
