fun main() {
    print("Masukkan sebuah bilangan: ")
    val bilangan = readLine()?.toInt()

    if (bilangan != null) {
        if (bilangan % 2 == 0) {
            println("$bilangan adalah bilangan genap")
        } else {
            println("$bilangan adalah bilangan ganjil")
        }
    } else {
        println("Input bilangan tidak valid")
    }
}
