package org.dargenzio
import org.apache.commons.validator.routines.EmailValidator

fun main(){
    val validateur = EmailValidator.getInstance()

    val emails = listOf("jo@pipo.org","ma_mu@m.ca", "a.a@a.ca", "a.a@a.aa", "ab@ab", "ab@ab", "a.b@ab", "jo" )

     emails.forEach{email ->
        if(validateur.isValid(email)){
            println("Ok : $email")
        }
        else{
            println("Ko : $email")
        }
    }
}