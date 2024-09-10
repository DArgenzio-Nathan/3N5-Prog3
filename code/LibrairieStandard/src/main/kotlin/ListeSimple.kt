package org.dargenzio

fun main(){
    println(repete(6,3))
}


fun repete(n: Int, nombreFois: Int):List<Int> {


    var liste: List<Int> = (1..n).toList()


    return List(nombreFois) {liste}.flatten()
}