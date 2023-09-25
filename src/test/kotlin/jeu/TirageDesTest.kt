package jeu

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class TirageDesTest {

    @Test
    fun lance() {
        // Test unitaire pour le tirage de Des
        // Exemple : 3d9
        val des = TirageDes(3, 9)
        // valeur minimum = 3
        // valeur maximum = 3*9 =27

        val resultat = des.lance()
        println(" result = $resultat")
        Assertions.assertTrue(resultat >= 3)
        Assertions.assertTrue(resultat <= 27)
    }
}