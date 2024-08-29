package org.dargenzio

fun main(args: Array<String>){
    for (arg: String in args){
        val hauteur: Int = arg.toInt()
        Pyramide(hauteur)
    }

}

fun Pyramide(hauteur: Int){
    var nbEtoiles: Int = 1
    var nbEspaces: Int = hauteur - 1
    var ligne: String = ""
    for (i: Int in 1..hauteur){
        ligne = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        println(ligne)
        nbEtoiles +=2
        nbEspaces -=1
    }
}