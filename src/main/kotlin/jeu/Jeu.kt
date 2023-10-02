package jeu

import personnage.Personnage
import edict
import leManteauDeLaNuit



class Jeu(monstres: List<Personnage>) {
    lateinit var joueur: Personnage
    var combats: MutableList<Combat> = mutableListOf()
    var score: Int = 0

    // Corps du constructeur
    init {
        // Lancement de la création du personage du joueur
        this.creerPersonnage()
        // Pour chaque monstre dans la liste de monstres
        for (unMonstre in monstres){
            // On créer un combat
            val unCombat= Combat(this,unMonstre)
            combats.add(unCombat)
        }
    }

    fun lancerCombat() {
        for (unCombat in this.combats) {
            unCombat.executerCombat()
            // Mettre à jour le score en fonction du nombre de tours
            val tours = unCombat.nombreTours
            score += calculerScore(tours)
        }
        println("Score final du joueur: $score")
    }

    private fun calculerScore(tours: Int): Int {
        // Par exemple, vous pouvez attribuer plus de points pour moins de tours
        return 500 - tours * 10
    }

    /**
     *  Méthode pour créer le personnage du joueur en demandant les informations à l'utilisateur
     *
     */
    fun creerPersonnage(): Personnage {
        val PTS_TOTAL = 40
        println("Création votre personnage:")

        // TODO Mission 1.1
        println("${ANSI_PURPLE}${ANSI_BOLD}${ANSI_UNDERLINE}Création de votre personnage :${ANSI_RESET}\n")
        print("Saisir le nom de votre personnage : ")
        val nom = readln()

        var attaque: Int
        var defense: Int
        var endurance: Int
        var vitesse: Int

        do {
            println("\nDistribuer ${ANSI_BOLD}40 pts au maximum${ANSI_RESET} sur les 4 critères suivants :")
            print("\tAttaque (${40} pts restant) : ")
            attaque = readln().toInt()
            print("\tDéfense (${PTS_TOTAL - attaque} pts restant) : ")
            defense = readln().toInt()
            print("\tendurance (${PTS_TOTAL - attaque - defense} pts restant) : ")
            endurance = readln().toInt()
            print("\tVitesse (${PTS_TOTAL - attaque - defense - endurance} pts restant) : ")
            vitesse = readln().toInt()

            val validation = (PTS_TOTAL - attaque - defense - endurance - vitesse) < 0
            println(if (validation) "\n${ANSI_RED}${ANSI_RAPID_BLINK}Mauvaise répartition...${ANSI_RESET} \nrecommencer la saisie.\n" else "${ANSI_BOLD}${ANSI_GREEN}\nRépartition validée !${ANSI_RESET}\n")
        } while(validation)

        val pointDeVieMax = 100 + 10 * endurance
        val hero = Personnage(
            nom, pointDeVieMax,pointDeVieMax,
            attaque, defense,
            endurance, vitesse,
            edict ,leManteauDeLaNuit
        )
        this.joueur = hero
        return hero
    }

}