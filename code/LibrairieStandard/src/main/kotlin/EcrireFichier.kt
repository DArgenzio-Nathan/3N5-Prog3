package org.dargenzio

import java.io.File

fun main(args: Array<String>){
    var nomFichier1: String = args[0]
    var fichier1: File = File(nomFichier1)
    if (fichier1.exists()){
        fichier1.writeText("Nathan D'Argenzio")
    }
    else {
        println("Le fichier $nomFichier1 n'existe pas")
    }
}