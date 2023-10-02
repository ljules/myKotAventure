package item

import personnage.Personnage

class Potion(
    val soin: Int,
    val nom: String,
    val description: String
) {
    fun utiliser(cible : Personnage) {
        // Sera défini plus tard...
    }
}