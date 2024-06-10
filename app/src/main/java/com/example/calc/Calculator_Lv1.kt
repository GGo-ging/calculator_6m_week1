package com.example.calc

class Calculator_Lv1 {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        return a / b
    }
}

fun main() {
    val calculator = Calculator_Lv1()
    println("Addition: ${calculator.add(10.0, 5.0)}")
    println("Subtraction: ${calculator.subtract(10.0, 5.0)}")
    println("Multiplication: ${calculator.multiply(10.0, 5.0)}")
    println("Division: ${calculator.divide(10.0, 5.0)}")
}