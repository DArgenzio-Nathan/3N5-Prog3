package org.dargenzio

fun main(){

    //int to float
    val nombreInt: Int = 23
    val nombreFloat = nombreInt.toFloat()
    println(nombreFloat)

    //Double to int
    val nombreDoub: Double = 42.21
    val nombreInt2 = nombreDoub.toInt()
    println(nombreInt2)

    //String to int
    val unstring: String = "10"
    val nombreInt3 = unstring.toInt()
    println(nombreInt3)

    //int to string
    val nombreInt4: Int = 56
    val unstring2 = nombreInt4.toString()
    println(unstring2)

    //float to double
    val nombreFloat2: Float = 23.2F
    val nombreDouble2 = nombreFloat2.toDouble()
    println(nombreDouble2)

}