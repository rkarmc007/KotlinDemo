fun main(args: Array<String>) {

    var amount = 500


    try {
        validateMethod(amount)
    } catch (e: MinBalanceException) {
        println(e.message)
    } catch (e: Exception) {
        e.message
    }

}

fun validateMethod(amount: Int) {
    throw MinBalanceException("You amount $amount is less than1000")
}