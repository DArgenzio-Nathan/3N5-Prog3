package org.dargenzio

import java.util.LinkedList
import kotlin.random.Random

fun main(){
    val liste1 = LinkedList<Int>()
    val liste2 = ArrayList<Int>()
    testeCetteListe(liste1)
    testeCetteListe(liste2)

}

fun testeCetteListe(liste: MutableList<Int>) {
    val random: Random = Random(1234)
    val a = System.currentTimeMillis()
    liste.add(100000)
    // ajouter 100 000 elements en dernière position liste.add(nombre);
    val b = System.currentTimeMillis()
    liste.add(0, 100000)
    // ajouter 100 000 elements en première position liste.add(0, nombre);
    val c = System.currentTimeMillis()
    liste.add(random.nextInt(liste.size + 1), 100000)
    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size + 1), nombre);
    val d = System.currentTimeMillis()
    println("$b - $a,  $c - $b,  $d - $c")
    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
}