package item

import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*

class ArmeTest {

    @Test
    fun calculerDegats() {
        // Objet de test :
        val objTest = Arme(
            "Arme test",
            "Arme pour test unitaire",
            TypeArme(1,1,2,21),
            Qualite("Qualité pour test",5, "")
            )

        // Test
        val degats = objTest.calculerDegats()
        Assertions.assertEquals(degats, 6)
    }
}