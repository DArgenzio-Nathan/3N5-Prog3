package org.dargenzio

fun main(args : Array<String>){

    for(arg in args){
        val nombre = arg.toInt()
        val binaire = nombre.toString(2)
        println(binaire)
    }



}