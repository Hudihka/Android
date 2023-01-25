package com.example.hudihka.english.Words

import com.example.hudihka.english.Words.WordsViewModel
import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

final class WordsViewModel: WordsInterfaceIn, WordsInterfaceOut {
    override var segmentIndex: (Int) -> Void = { _ }
    override var switchValue: (Boolean) -> Void = { _ }
    override var arrayLists: (Array<ListWords>) -> Void = { _ }

    override fun tapedFavorit(word: Word) {

    }

    override fun tapedSegment(segment: WordsEndpoint) {

    }

    override fun tapedSwitch(value: Boolean) {

    }

    override fun giveMeData() {

    }
}