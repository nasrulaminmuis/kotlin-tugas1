fun main() {
    print("Masukkan sebuah bilangan: ")
    val bilangan = readLine()?.toInt() ?: 0

    if (bilangan % 2 == 0) {
        println("$bilangan adalah bilangan genap")
    } else {
        println("$bilangan adalah bilangan ganjil")
    }
}
