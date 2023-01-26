package com.example.hudihka.english.models

class ListWords(json: JSON ) {
    val number: Int
    val description: String
    var words: Array<Word>

    init {
        this.number = json["number"] as Int
        this.description = json["description"].toString()

        val arrays: Array<Map<String, String>> = json["array"] as Array<Map<String, String>>
        this.words = Word.generateArray(arrays)
    }

    companion object {
        fun generateListsWords(json: ArrayJSON): Array<ListWords> {
            return json.map { ListWords(it) }.sortedBy { it.number < it.number }.toTypedArray()
        }
    }
}