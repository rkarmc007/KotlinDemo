fun main(args: Array<String>) {

    var str: String = "Kotlin Tutorial.\nSource Code Examples\nAndroid Demo Project"

    var result = str.lines()

    result.forEach { println(it) }
}