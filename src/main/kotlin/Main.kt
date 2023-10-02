import item.Qualite
import jeu.Jeu
import personnage.Personnage
import item.Arme
import item.TypeArme
import item.TypeArmure
import item.Armure
import jdk.dynalink.linker.support.TypeUtilities

// Instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")


// Instanciation des TypeArme :
val typeDague = TypeArme(1, 4, 3, 18)
val typeBaton = TypeArme(1, 6, 2, 20)
val typeLance = TypeArme(1, 8, 3, 20)
val typeArbaleteLegere = TypeArme(1, 8, 2, 19)
val typeEpeeCoute = TypeArme(1, 6, 2, 19)
val typeHache = TypeArme(1, 8, 3, 20)
val typeEpeeLongue = TypeArme(1, 8, 2, 19)
val typeMarteauDeGuerre = TypeArme(1, 8, 3, 20)
val typeArcLong = TypeArme(1, 8, 3, 20)

// Instanciation des armes :
val edict = Arme("Edict", "Une dague légendaire en mithril", typeDague, qualiteLegendaire)
val epeeLongueDuDroit = Arme("Epée longue du droit", "Une épée en fer froid", typeEpeeLongue, qualiteRare)
val lanceDuKobold = Arme("Lance du kobold", "Une lance rudimentaire", typeLance, qualiteCommun)
val hachePlus2 = Arme("Hache + 2", "Une hache tranchante", typeHache, qualiteEpic)
val tonnerre = Arme("Tonnerre", "Un marteau légendaire qui frappe comme la foudre", typeMarteauDeGuerre, qualiteLegendaire)


// Instanciation des typeArmure :
val typeRembourre = TypeArmure("Rembourré", 1)
val typeCuir = TypeArmure("Cuir", 2)
val typeCuirCloute = TypeArmure("Cuir clouté", 3)
val typeChemiseChaine = TypeArmure("Chemise à chaîne", 4)
val typePectoral = TypeArmure("Pectoral", 5)
val typeCotteDeMailles = TypeArmure("Cotte de mailles", 6)

// Instanciation des armures :
val cotteMaillesAdamntine = Armure("Cotte de mailles en adamantine", "Cotte de mailles plus loudre mais plus solide", typeCotteDeMailles, qualiteRare)
val leManteauDeLaNuit = Armure("Le manteau de la nuit", "Une armure obscure comme la nuit", typeCuir, qualiteEpic)
val armureDuGobelin = Armure("Armure du Gobelin", "Armure en cuire rudimentaire", typeCuir, qualiteCommun)



fun main(args: Array<String>) {

    //Instantiation des monstres
    val gobelin = Personnage(
        "XXX le gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6,
        armePrincipal = edict,
        armure = armureDuGobelin)

    val ameEnPeine = Personnage(
        "Ame en peine",
        67,
        67,
        10,
        12,
        0,
        14,
        edict,
        leManteauDeLaNuit)

    val armureAnimee = Personnage(
        "Armure animée",
        33,
        33,
        8,
        15,
        8,
        6,
        edict,
        cotteMaillesAdamntine)

    val ettin = Personnage(
        "Ettin",
        88,
        88,
        16,
        12,
        14,
        8,
        edict,
        leManteauDeLaNuit)

    val elementaire = Personnage(
        "Elémentaire du feu",
        102,
        102,
        12,
        10,
        8,
        16,
        edict,
        leManteauDeLaNuit)


    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf( gobelin, ameEnPeine, armureAnimee))

    //Lancement du jeu
    jeu.lancerCombat()
}