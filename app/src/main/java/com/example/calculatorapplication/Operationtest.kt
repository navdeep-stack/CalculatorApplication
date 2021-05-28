package com.example.calculatorapplication
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertEquals

class Operationtest {
    @Test

    fun add_Iscorrect() {

        var expectedValue = 4
        var actualValue = 2 + 2
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun div_Iscorrect() {

        var expectedValue = 3
        var actualValue = 6 / 2
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun sub_Iscorrect() {

        var expectedValue = 4
        var actualValue = 10 - 6
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun Mult_Iscorrect() {

        var expectedValue = 18
        var actualValue = 6 * 3
        assertEquals(expectedValue, actualValue)
    }

}