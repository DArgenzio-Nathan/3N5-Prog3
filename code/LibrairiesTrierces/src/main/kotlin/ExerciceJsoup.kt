package org.dargenzio

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main(args: Array<String>){
    for(arg in args){
        var doc : Document = Jsoup.connect(arg).get()
        val links: Elements = doc.select("a")

        for (link: Element in links){
            println(link.attr("href"))
            println(link.text())
        }


    }

}

