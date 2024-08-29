package org.dargenzio

import kotlin.random.Random

fun main(){

   creeTaleauAleatoire(5)

}

fun creeTaleauAleatoire(n: Int): Array<Int>{

    val aleatoire = Random
    val nbAleatoire = aleatoire.nextInt(1,101)


    val UnArray = arrayOf(nbAleatoire)

    return UnArray
}