package com.example.hudihka.english.Words

import android.widget.Button
import androidx.lifecycle.ViewModel
import com.example.hudihka.english.DataProvider.DataProvider
import com.example.hudihka.english.Words.WordsViewModel
import com.example.hudihka.english.models.ListWords
import com.example.hudihka.english.models.Word

class WordsViewModel: ViewModel(), WordsInterfaceIn, WordsInterfaceOut {
    private val dataProvider = DataProvider()

    override var segmentIndex: (Int) -> Unit = {  }
    override var switchValue: (Boolean) -> Unit = {  }
    override var arrayLists: (Array<ListWords>) -> Unit = {  }

    override fun tapedFavorit(word: Word) {

        ///
        //
        //

        segmentIndex(10)
    }

    override fun tapedSegment(segment: WordsEndpoint) {

    }

    override fun tapedSwitch(value: Boolean) {

    }

    override fun giveMeData() {

    }
}