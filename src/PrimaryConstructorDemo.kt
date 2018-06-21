fun main(args: Array<String>) {

    var obj = Hero("Htet")
    obj.printMsg()
}

class Hero(var name: String = "") {

    var age: Int = 29


    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    fun printMsg() {
        println("$name is $name,$age is $age")
    }

}