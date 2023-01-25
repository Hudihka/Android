package com.example.hudihka.english.DataProvider

import com.example.hudihka.english.models.СontentJSON
import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

class DataProvider {
    lateinit var allLists: Array<ListWords>

    init {
        val json: Array<Map<String, Any>> = СontentJSON.contentJSON
        this.allLists = ListWords.generateListsWords(json = json)
    }

    fun update(word: Word) {
        allLists.forEachIndexed { indexList, list ->
            val indexWord = list.words.indexOfFirst { it.key == word.key }
            allLists[indexList].words[indexWord] = word
        }
    }

    fun onlyFavorit(): Array<ListWords> {

        var listsWords = arrayOf<ListWords>()

        for (list in allLists) {
            val words = list.words.filter { it.isFavorit }.toTypedArray()

            if (words.isNotEmpty()) {
                list.words = words
                listsWords += list
            }
        }

        return listsWords
    }
}