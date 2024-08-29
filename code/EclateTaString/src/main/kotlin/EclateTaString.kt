package org.dargenzio

fun main(args : Array<String>){

    for(arg: String in args ){
        arg.forEach { char ->
            println(char)
        }
    }

}

