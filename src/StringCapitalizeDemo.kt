fun main(args:Array<String>){
    val str = "kotlin tutorial examples"

    val result = str.split(" ").toMutableList()

    var output  = " "

    for(word in result){
        output += word.capitalize()+ " "
    }

    output = output.trim()

    println(output)
}