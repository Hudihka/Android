package com.example.hudihka.english

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hudihka.english.Words.WordsViewModel

class MainActivity : AppCompatActivity() {
    val vm: WordsViewModel = WordsViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}