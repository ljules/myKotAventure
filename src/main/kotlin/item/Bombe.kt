package item

import personnage.Personnage
import jeu.TirageDes

class Bombe(
    val NombreDeDes: Int,
    val maxDe: Int,
    val nom: String,
    val description: String
) {
    fun utiliser(cible: Personnage) {
        val totalDe = TirageDes(3,8).lance()
        var degats = totalDe - cible.calculeDefense()
        degats = if (degats > 1) degats else 1
        cible.pointDeVie -= degats
        println("Points de dégâts infligé : $degats")

    }
}