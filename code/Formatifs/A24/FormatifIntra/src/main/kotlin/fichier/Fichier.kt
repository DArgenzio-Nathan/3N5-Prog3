package fichier

import org.jsoup.Jsoup
import java.io.File

fun main(args: Array<String>) {
    // Tu peux tester tes fonctions en les appellants ici.
    ecrire(args)
    lire()
}

/**
 * (1 point) Affiche dans la console le contenu du fichier message.txt qui se trouve dans le projet de départ.
 */
fun lire() {
    var fichier = File("message.txt")
    var texte: String = fichier.readText()
    println(texte)
}

/**
 * (1 point) S’il n’y a pas 2 éléments dans le paramètre args, affiche un message d'erreur, et retourne la valeur -1.
 * (1 point) Crée un fichier dans le répertoire du projet, dont le nom sera déterminé par le premier argument.
 *           Par exemple, si l’argument est « pipo.txt » l’application crée le fichier dans le dossier du projet avec le
 *           nom « pipo.txt ».
 * (1 point) Le fichier aura comme contenu le texte contenu dans le 2ème élément qui est dans le paramètre args.
 * Si tout s'est bien passé, on retourne la valeur 1.
 */
fun ecrire(args: Array<String>): Int {

    if(hasTwoElements(args)){
        val fichier = File(args[0])
        fichier.createNewFile()
        fichier.writeText(args[1])
        return 1
    }
    else{
        println("Merci de fournir 2 elements")
        return -1
    }


}

fun hasTwoElements(args: Array<String>): Boolean {
    return args.size == 2
}