
fun main() {
    val harpok = 27000.0
    val harjul = 60000.0
    var diskon = 0.10 
    for (i in 1..7) {
        var penber = harjul - diskon
        println ("Hari ke $i = $penber")
        diskon /= 2
    }

    
}