fun main() {
    var pilihan: Int
    var jariJari: Double
    var sisi: Double
    var panjang: Double
    var lebar: Double
    var alas: Double
    var tinggi: Double

        println("Silakan pilih bangun datar yang akan dihitung luasnya:")
        println("1. Lingkaran")
        println("2. Persegi empat")
        println("3. Persegi panjang")
        println("4. Segitiga")
        print("Pilihan Anda: ")
        pilihan = readLine()!!.toInt()

        when (pilihan) {
            1 -> {
                print("Masukkan jari-jari lingkaran: ")
                jariJari = readLine()!!.toDouble()
                val luas = Math.PI * jariJari * jariJari
                println("Luas lingkaran adalah $luas")
            }
            2 -> {
                print("Masukkan sisi persegi empat: ")
                sisi = readLine()!!.toDouble()
                val luas = sisi * sisi
                println("Luas persegi empat adalah $luas")
            }
            3 -> {
                print("Masukkan panjang persegi panjang: ")
                panjang = readLine()!!.toDouble()
                print("Masukkan lebar persegi panjang: ")
                lebar = readLine()!!.toDouble()
                val luas = panjang * lebar
                println("Luas persegi panjang adalah $luas")
            }
            4 -> {
                print("Masukkan alas segitiga: ")
                alas = readLine()!!.toDouble()
                print("Masukkan tinggi segitiga: ")
                tinggi = readLine()!!.toDouble()
                val luas = 0.5 * alas * tinggi
                println("Luas segitiga adalah $luas")
            }
            else -> println("Pilihan Salah")
        }
}
