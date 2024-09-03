package org.dargenzio

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(args: Array<String>){

    for (arg in args){
        var doc : Document = Jsoup.connect(arg).get();

        println("Title: ${doc.title()}")

        val htmlContent: String = doc.html()
        println("html Content:\n$htmlContent")
    }


}