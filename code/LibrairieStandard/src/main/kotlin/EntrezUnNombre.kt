package org.dargenzio

fun main(){
    var question: String = "Veuillez entrer un nombre :"
    while (true){
        println(question)
        var reponse: String = readln()
        if(reponse.toIntOrNull() != null ){
            println("Merci, votre nombre est $reponse.")
            return
        }
        else{
            print("Ceci n’est pas un nombre, ")
        }
    }
}