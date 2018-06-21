import java.io.File

fun main(args: Array<String>) {

    val fileName = "demo.txt"

    var file = File(fileName)

    var isNewFileCreate: Boolean = file.createNewFile()

    if (isNewFileCreate) {
        println("$fileName is create successfully!!!")
    } else {
        println("$fileName already exists")
    }

    var isFileCreated: Boolean = file.createNewFile()

    if (isFileCreated) {
        println("$fileName is create successfully!!!")
    } else {
        println("$fileName already exists")
    }

}