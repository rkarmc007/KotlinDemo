import java.io.File

fun main(args: Array<String>) {

    var file = File("/Users/rkar/Documents/KotlinTutorials/src/input/test/context.txt")

    File("./").walk().forEach {
        println(it.extension + " is extension of "+ it.name)
    }
}