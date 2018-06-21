fun main(args: Array<String>) {
    var operation = Multiply(4,2)

    var result = execute(operation)

    println("Result $result")
}

sealed class ArithmeticOperation

class Add(var a: Int, var b: Int) : ArithmeticOperation()
class Subtract(var a: Int, var b: Int) : ArithmeticOperation()
class Multiply(var a: Int, var b: Int) : ArithmeticOperation()
class Divide(var a: Int, var b: Int) : ArithmeticOperation()

fun execute(op: ArithmeticOperation) = when (op) {

    is Add -> op.a + op.b
    is Subtract -> op.a - op.b
    is Multiply -> op.a * op.b
    is Divide -> op.a / op.b
}