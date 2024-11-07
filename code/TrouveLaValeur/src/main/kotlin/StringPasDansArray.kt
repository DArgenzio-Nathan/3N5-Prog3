package org.dargenzio

class StringPasDansArray:Exception() {
    override val message: String?
        get() = "String not found in array"

}