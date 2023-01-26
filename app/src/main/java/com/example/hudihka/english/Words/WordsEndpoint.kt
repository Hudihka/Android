package com.example.hudihka.english.Words

enum class WordsEndpoint {
    ALL, FAVORIT;

    companion object {
    fun from(index: Int): WordsEndpoint {
            if (index == 0) {
                return ALL
            } else {
                return FAVORIT
            }
        }
    }
}