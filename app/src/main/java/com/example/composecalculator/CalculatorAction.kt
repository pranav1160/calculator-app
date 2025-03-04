package com.example.composecalculator

sealed class CalculatorAction{
    data object Delete : CalculatorAction()
    data object Clear : CalculatorAction()
    data object Decimal : CalculatorAction()
    data object Calculate:CalculatorAction()
    data class Number(val number:Int):CalculatorAction()
    data class Operation(val operation : CalculatorOperation):CalculatorAction()
}
