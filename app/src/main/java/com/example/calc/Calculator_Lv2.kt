package com.example.calc

import java.io.IOException

class Calculator_Lv2 {
    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        if (b== 0.0) {
            throw IOException("0으로 나눌 수 없습니다.")
        }
        return a / b
    }

    fun remainder(a: Double, b: Double): Double = a % b
}

fun main() {
    val calculator = Calculator_Lv2()
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("부호를 입력해주세요. --->  (1:+, 2:-, 3:*, 4:/, 5:%) or 나가기 : -1")
        when (scanner.nextInt()) {
            -1 -> break
            1 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.add(a, b)}")
            }

            2 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.subtract(a, b)}")
            }

            3 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.multiply(a, b)}")
            }

            4 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.divide(a, b)}")
            }

            5 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.remainder(a, b)}")
            }

            else -> throw IOException("error")
        }
    }
}