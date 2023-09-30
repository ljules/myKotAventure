import item.Qualite
import jeu.Jeu
import personnage.Personnage

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")



fun main(args: Array<String>) {

    //Instantiation des monstres
    val gobelin = Personnage(
        "XXX le gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6)

    val ameEnPeine = Personnage(
        "Ame en peine",
        67,
        67
        10,
        12,
        0,
        14)

    val armureAnimee = Personnage(
        "Armure animée",
        33,
        33,
        8,
        15,
        8,
        6)

    val ettin = Personnage(
        "Ettin",
        88,
        88,
        16,
        12,
        14,
        8)

    val elementaire = Personnage(
        "Elémentaire du feu",
        102,
        102,
        12,
        10,
        8,
        16)


    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf( gobelin, ameEnPeine, armureAnimee))

    //Lancement du jeu
    jeu.lancerCombat()
}