fun main(args: Array<String>) {
    var a: String = "apple"
    var b: String = "app"

    var result = a.compareTo(b)

    if (result == 0) {
        println("$a and $b are equal")
    } else if (result < 0) {
        println("$a less than $b")
    } else {
        println("$a less than $b")
    }

    a = "appLE"
    b = "ApPle"

    result = a.compareTo(b, true)

    if (result == 0) {
        println("$a and $b are equal")
    } else if (result < 0) {
        println("$a less than $b")
    } else {
        println("$a less than $b")
    }
}