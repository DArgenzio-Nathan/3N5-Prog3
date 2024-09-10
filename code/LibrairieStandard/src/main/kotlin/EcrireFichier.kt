package org.dargenzio

import java.io.File

fun main(){
    var nomFichier1: String = "texte.txt"
    var fichier1: File = File(nomFichier1)

    if(fichier1.createNewFile()){
        println("Le fichier '$nomFichier1' a été créé avec succès.")
    } else {
        println("Le fichier '$nomFichier1' existe déjà.")
    }
    val texte = "Nathan D'Argenzio"
    fichier1.writeText(texte)
    println("Le texte $texte a été écrie dans le fichier $nomFichier1")
}