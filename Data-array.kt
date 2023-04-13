fun main() {

    val data = arrayOf( arrayOf("Ari Fahrudi", "17.12.1234", "Sistem Informasi"), arrayOf("Andi Cahyanto", "17.11.1234", "Informatika"), arrayOf("Salman", "17.02.1234", "Manajemen Informatika") ) 
    
    for (i in data.indices) { println("NAMA: ${data[i][0]}, NIM: ${data[i][1]}, JURUSAN: ${data[i][2]}") }

}
