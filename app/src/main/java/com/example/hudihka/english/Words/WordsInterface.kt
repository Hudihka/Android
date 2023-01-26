package com.example.hudihka.english.Words

import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

interface WordsInterfaceIn {
    fun tapedFavorit(word: Word)
    fun tapedSegment(segment: WordsEndpoint)
    fun tapedSwitch(value: Boolean)

    fun giveMeData()
}

interface WordsInterfaceOut {
    var segmentIndex: (Int) -> Unit
    var switchValue: (Boolean) -> Void
    var arrayLists: (Array<ListWords>) -> Void
}