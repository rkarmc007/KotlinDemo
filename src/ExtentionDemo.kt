class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }
}

fun Calculator.multiply(a: Int, b: Int): Int {
    return a * b
}

fun main(args: Array<String>) {
    var a = 5
    var b = 3
    var calc: Calculator = Calculator()
    println(calc.add(a, b))
    println(calc.subtract(a, b))
    println(calc.multiply(a, b))
}