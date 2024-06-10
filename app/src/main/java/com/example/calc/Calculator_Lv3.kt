package com.example.calc

interface Operation {
    fun execute(a: Double, b: Double): Double
}

class AddOperation : Operation {
    override fun execute(a: Double, b: Double): Double = a + b
}

class SubtractOperation : Operation {
    override fun execute(a: Double, b: Double): Double = a - b
}

class MultiplyOperation : Operation {
    override fun execute(a: Double, b: Double): Double = a * b
}

class DivideOperation : Operation {
    override fun execute(a: Double, b: Double): Double = a / b
}

class Calculator_Lv3 {
    fun calculate(operation: Operation, a: Double, b: Double): Double {
        return operation.execute(a, b)
    }
}

fun main() {
    val calculator = Calculator_Lv3()
    val scanner = java.util.Scanner(System.`in`)

    while (true) {
        println("부호를 입력해주세요. --->  (1:+, 2:-, 3:*, 4:/, 5:%) or 나가기 : -1 ")
        when (scanner.nextInt()) {
            -1 -> break
            1 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.calculate(AddOperation(), a, b)}")
            }
            2 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.calculate(SubtractOperation(), a, b)}")
            }
            3 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.calculate(MultiplyOperation(), a, b)}")
            }
            4 -> {
                print("첫번째 숫자를 입력해주세요. : ")
                val a = scanner.nextDouble()
                print("두번째 숫자를 입력해주세요. : ")
                val b = scanner.nextDouble()
                println("결과 : ${calculator.calculate(DivideOperation(), a, b)}")
            }
            else -> println("error")
        }
    }
}
