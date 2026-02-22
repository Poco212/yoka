
fun main() {
    
    // harga pokok barang
    val harga_pokok = 27000.0
    
    // harga jual barang
    val harga_jualan = 60000.0
    
    // diskon hari pertama 10% dan berkurang setengah tiap hari nya
    var diskon = 0.10  
    
    // misalnya pemprintln ("Total untung atau rugi = $total_keuntungan")belian 5 dan bertambah 2 setiap harinya
    var beli = 5.0

    // total keuntungan 
    var total_keuntungan = 0.0

    for (i in 1..7) {
        // pajak
        val pajak = if ( i % 2 == 0) 0.20 else 0.125
        
        //harga setelah diskon
        val harjul_disk = harga_jualan - (harga_jualan * diskon)

        // harga setelah pajak
        val harjul_pajk = harjul_disk - (harjul_disk * pajak)

        // keuntungan setiap pembelian
        val keuntungan = harjul_pajk - harga_pokok

        // keuntungan setiap hari 
        val keuntungan_hari = keuntungan * beli
        
        // total keuntungan
        val total_keuntungan += keuntungan_hari

        println ("Hari ke $i")
        println ("Keuntungan = $keuntungan_hari")
        println ("-----------------------------")

        diskon /= 2
        beli += 2
    }

    println ("Total Keuntungan atau Kerugian = $total_keuntungan")
}