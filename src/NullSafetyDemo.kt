fun main(args: Array<String>) {
    var b: String? = "Hi !!!"
    var blen = b?.length ?: -1
    println("b is $b")
    println("b length is $blen")
    b = null
    println("b is $b")
    blen = b?.length ?: -1
    println("b length is $blen")
}