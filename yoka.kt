
fun main() {
    val harpok = 27000.0
    val harjul = 60000.0
    var diskon = 0.10 
    // misalnya
    var beli = 5
    for (i in 1..7) {
        val pajak = if ( i % 2 == 0) 0.20 else 0.125
        println ("Hari ke $i = $pajak")
    }
    
}