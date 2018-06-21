import java.io.File

fun main(args: Array<String>) {
    var file = File("/Users/rkar/Documents/KotlinTutorials/src/input" + File.separator + "context.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
}