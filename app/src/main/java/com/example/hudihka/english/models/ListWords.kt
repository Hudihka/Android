package com.example.hudihka.english.models

class ListWords(json: Map<String, String> ) {
    val number: Int
    val description: String
    val words: List<Word>

    init {
        this.number = json["number"]?.toInt()?:0
        this.description = json["description"].toString()

        val arrays: Array<Map<String, String>> = json["array"] as Array<Map<String, String>>
        this.words = Word.generateArray(arrays)
    }

    companion object {
        fun generateListsWords(json: Array<Map<String, String>>): List<ListWords> {
            return json.map { ListWords(it) }.sortedBy { it.number < it.number }
        }
    }
}