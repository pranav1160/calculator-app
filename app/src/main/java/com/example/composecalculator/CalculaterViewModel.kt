package com.example.composecalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculaterViewModel :ViewModel(){
    var state by mutableStateOf(CalculaterState())
    private set;
}