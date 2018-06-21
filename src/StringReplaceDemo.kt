fun main(args: Array<String>) {

    var str = " Replace String - Programs"
    val oldValue = "PROGRAMS"
    val newValue = "Examples"

    val output = str.replace(oldValue, newValue, ignoreCase = true)
    println(output)
}

