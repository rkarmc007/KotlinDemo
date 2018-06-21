import java.io.File
import java.io.PrintWriter

fun main(args: Array<String>) {
    var fileName: String = "Hello Kotlin World.Nice Guys!!!!"

    File("/Users/rkar/Documents/KotlinTutorials/src/input/file.txt").printWriter().use { out ->
        out.print(fileName)
    }

}