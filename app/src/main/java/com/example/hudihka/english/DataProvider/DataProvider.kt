package com.example.hudihka.english.DataProvider
import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

class DataProvider {
    lateinit var allLists: Array<ListWords>

    init {
        this.allLists = ListWords.generateListsWords(json: contentJSON)
    }

    fun update(word: Word) {
        allLists.enumerated().forEach { (indexList, list) in
            if let indexWord = list.words.firstIndex(where: { $0.key == word.key }) {
                allLists[indexList].words[indexWord] = word

                return
            }
        }
    }
}