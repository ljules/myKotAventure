package item
import personnage.Personnage

class Armure(
    val nom: String,
    val description: String,
    val typeArmure: TypeArmure,
    val qualite: Qualite
) {
    fun calculProtection() = typeArmure.bonusType + qualite.bonusRarete

    fun utiliser(cible: Personnage) {
        // Corps développé plus tard...
    }
}