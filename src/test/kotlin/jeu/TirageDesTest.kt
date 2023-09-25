package jeu

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TirageDesTest {

    @Test
    fun lance() {
        // Test unitaire pour le tirage de Des
        val des= TirageDes(3,9)
        // valeur minimum = 3
        // valeur maximum = 3*9 =27
        repeat(30)
        {
            val result= des.lance()
            println(result)
            assert(result>=3)
            assert(result<=27)
        }

    }
}