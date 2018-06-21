import java.io.File
import java.io.InputStream
import java.nio.charset.Charset

fun main(args: Array<String>) {

    val fileName: String = "/Users/rkar/Documents/KotlinTutorials/src/input/context.txt"

//    var ins:InputStream = file.inputStream()
//
//    var result = ins.readBytes().toString(Charset.defaultCharset())

//    var byte: ByteArray = file.readBytes()
//
//    for (by in byte){
//        print(by.toChar())
//    }

//    var lines:List<String> = file.readLines()
//
//    for(line in lines){
//        println(line)
//    }

    var i: Int = 1

    File(fileName).readLines().forEach {
        print((i++))
        println(": " + it)
    }
}