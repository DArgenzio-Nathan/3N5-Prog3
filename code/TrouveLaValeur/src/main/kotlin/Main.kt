package org.dargenzio

fun main() {
    try{
        trouveru(arrayOf("allo", "bonjour", "hello"), "allo")
    }
    catch (e: StringPasDansArray){
        println(e.message)
    }

}

fun trouveru(array: Array<String>, str: String){
        for (i in array.indices) {
            if (array[i] == str) {
                println(i)
                return
            }
            else{
                throw StringPasDansArray()
            }
        }

}