package com.example.hudihka.english.models
import kotlin.collections.List

class Word(json: Map<String, String> ) {
    val trans: String
    val form1: String
    val form2: String
    val form3: String

    val key: String

    var isFavorit: Boolean = false

    init {
        this.trans = json["trans"].toString()
        this.form1 = json["form1"].toString()
        this.form2 = json["form2"].toString()
        this.form3 = json["form3"].toString()

        this.key = "${trans}_${form1}_${form2}_${form3}"
    }

    companion object {
        fun generateArray(json: Array<Map<String, String>>): List<Word> {
            return json.map { Word(it) }.sortedBy { it.form1 < it.form1 }
        }
    }
}