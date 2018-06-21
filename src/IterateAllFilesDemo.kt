import java.io.File

fun main(args: Array<String>) {

    File("/Users/rkar/Documents/KotlinTutorials/src/input/").walk().forEach {
        println(it)
    }

}