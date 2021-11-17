package com.example.android.guesstheword.screens

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        val i = Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}