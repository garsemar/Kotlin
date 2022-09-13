package cat.itb.martigarcia7e4.dam1.m03.uf2.generalexam

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

internal class OilSpillTest {

    private val testSample: OilSpill = OilSpill()

    @BeforeEach
    fun setUp() {

    }

    @Test
    fun addOil(){
        val expected = Oil("ab1", "b", 12, 0.6f)
        testSample.addOil(expected.nom, expected.nomEmpresa, expected.litres, expected.toxicitat)
        assertEquals(expected.nom, testSample.oil.last().nom)
    }

    /*@Test
    fun sum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }*/
}