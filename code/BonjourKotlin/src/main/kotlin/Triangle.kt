package org.dargenzio



//fun triangle(hauteur : Int) : String{
//
//
//    return ("*".repeat(hauteur))
//
//}
//
//fun main(){
//var result = triangle(hauteur = 4)
//    repeat(4) {
//        println(result)
//    }
//
//}

//changer les print pour les mettre dans var
fun triangle(hauteur : Int) : String{
    var maString: String = ""
    for (i in 1..hauteur){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    return maString
}

fun main(){
    triangle(hauteur = 4)

}



