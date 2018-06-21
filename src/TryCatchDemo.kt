fun main(args: Array<String>) {

    val a = 8
    val b = 0

    var c: Int

    try {
        c = a / b
        println(c.toString())
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}