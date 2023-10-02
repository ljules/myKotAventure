package item

import jeu.TirageDes
import personnage.Personnage

class Arme(
    val nom: String,
    val description: String,
    val typeArme: TypeArme,
    val qualite: Qualite
) {
    fun utiliser(cible: Personnage) {
    // TODO Corps sera développé plus tard pour la mission 3.1
    }

    fun calculerDegats(): Int {
        // Calcul des dégats de base :
        var degats = TirageDes(typeArme.nombreDes, typeArme.valeurDeMax).lance()

        // Calcul de la criticité :
        val criticite = if (TirageDes(1, 20).lance() >= typeArme.activationCritique) typeArme.multiplicateurCritique  else 1
        degats *= criticite

        // Bonus rareté :
        degats += qualite.bonusRarete

        return degats
    }
}