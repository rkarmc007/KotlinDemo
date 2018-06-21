import java.io.File

fun main(args: Array<String>) {

    File("/Users/rkar/Documents/KotlinTutorials/src/input/file.txt").copyTo(File("/Users/rkar/Documents/KotlinTutorials/src/input/dumb_file.txt"), false)
}