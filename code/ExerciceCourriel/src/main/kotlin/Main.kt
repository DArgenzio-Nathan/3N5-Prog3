package org.dargenzio

import org.apache.commons.validator.routines.EmailValidator


fun main() {
    isValidEmail("bob@smith.org")
    isValidEmail("a.b.c@pipo.com")
    isValidEmail("bob@smith")
    isValidEmail("john.doe@.com")
}

fun isValidEmail(courriel: String): Boolean {
    return if (EmailValidator.getInstance().isValid(courriel)) {
        println("OK")
        true
    } else {
        println("KO")
        false
    }
}