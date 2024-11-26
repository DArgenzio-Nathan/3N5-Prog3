package org.dargenzio

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MainTest {

    @Test
    fun testValidMajZipCode() {
        assertTrue(isValidZipCode("K1A 0B1"))
    }

    @Test
    fun testValidMinZipCode() {
        assertTrue(isValidZipCode("k1a 0b1"))
    }

    @Test
    fun testValid2spaceZipCode() {
        assertTrue(isValidZipCode("K1A  0B1"))
    }

    @Test
    fun testValidtiretZipCode() {
        assertTrue(isValidZipCode("K1A-0B1"))
    }

    @Test
    fun testInvalidNumZipCode() {
        assertFalse(isValidZipCode("12345"))
    }

    @Test
    fun testInvalidZipCode() {
        assertFalse(isValidZipCode("ABCDE"))
    }

    @Test
    fun testInvalid3spaceZipCode() {
        assertFalse(isValidZipCode("K1A   0B1"))
    }

    @Test
    fun testInvalidunderscoreZipCode() {
        assertFalse(isValidZipCode("K1A_0B1"))
    }

}