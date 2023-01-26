package com.example.hudihka.english.DataProvider

import com.example.hudihka.english.models.СontentJSON
import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

class DataProvider {
    lateinit var allLists: Array<ListWords>

    init {
        val json: Array<Map<String, Any>> = СontentJSON.contentJSON
        this.allLists = ListWords.generateListsWords(json = json)


//        https://developer.android.com/topic/libraries/architecture/livedata
    }

    fun update(word: Word) {
        var b: Int? = 5
        b = null

        let d = b ?? 8

        b?.let {
            println(it)
        }?: run { b = 10 }

        var a = [5, 6, 7]

        let index = a.firstIndex({ $0 == 6 }) {

        }

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