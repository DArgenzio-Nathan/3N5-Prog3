package org.dargenzio

fun main() {
    isValidZipCode("K1A 0B1")
    isValidZipCode("12345")
    isValidZipCode("BCOSMS")
    isValidZipCode("G3E-1D4")
    isValidZipCode("G3E  1D4")
    isValidZipCode("G3E1D4")
}

fun isValidZipCode(zippy: String): Boolean {
    val regex = "^[A-Za-z]\\d[A-Za-z][ -]{0,2}?\\d[A-Za-z]\\d$".toRegex()
    return if (zippy.matches(regex)) {
        println("OK")
        true
    } else {
        println("KO")
        false
    }
}
