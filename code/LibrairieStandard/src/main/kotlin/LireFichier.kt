package org.dargenzio

import java.io.File

fun main(args: Array<String>){
    for (arg in args){
        var nomFichier1: String = arg
        var fichier1: File = File(nomFichier1)
        if (fichier1.exists()){
            try {
                var texte1: String = fichier1.readText()
                println(texte1)
                println("----------")
            } catch (e: Exception) {
                println("Le fichier $nomFichier1 ne peut pas etre lu")
            }
        }
        else {
            println("Le fichier $nomFichier1 n'existe pas")
        }
    }


}