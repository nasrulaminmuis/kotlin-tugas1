fun main() {
    //mengambil input dari pengguna
    print("Masukkan nama barang: ")
    val namaBarang = readLine()!!

    print("Masukkan jumlah barang: ")
    val jumlahBarang = readLine()!!.toInt()

    print("Masukkan harga satuan barang: ")
    val hargaSatuan = readLine()!!.toInt()

    val totalHarga = jumlahBarang * hargaSatuan //menghitung total harga barang
    var potonganBelanja = 0 //inisialisasi potongan belanja

    //percabangan untuk menghitung potongan belanja
    if (totalHarga >= 200000) {
        potonganBelanja = (totalHarga * 15) / 100
    }

    val totalBayar = totalHarga - potonganBelanja //menghitung total harga yang harus dibayar

    //menampilkan output program
    println("Nama Barang: $namaBarang")
    println("Jumlah Barang: $jumlahBarang")
    println("Harga Satuan Barang: Rp $hargaSatuan")
    println("Total Harga: Rp $totalHarga")
    println("Potongan Belanja: Rp $potonganBelanja")
    println("Total yang Harus Dibayar: Rp $totalBayar")
}
