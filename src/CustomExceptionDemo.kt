fun main(args: Array<String>) {

    var name = "Tutorial 70"
    var age = 101

    try {
        validateName(name)
    } catch (e: InvalidNameException) {
        println(e.message)
    } catch (e: InvalidAgeException) {
        println(e.message)
    }

    try {
        validateAge(age)
    } catch (e: InvalidNameException) {
        println(e.message)
    } catch (e: InvalidAgeException) {
        println(e.message)
    }
}

fun validateName(name: String) {
    if (name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("$name is invalid.Includes numeral")
    }
}

fun validateAge(age: Int) {

    if (age < 18 || age > 100) {
        throw InvalidNameException("$age is invalid.It not between 18 and 100")
    }
}
