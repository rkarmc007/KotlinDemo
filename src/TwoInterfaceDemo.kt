interface TwoInterfaceDemo {

    var name: String
    var address: String

    fun whereGo() {
        println("$name is going to $address")
    }

    fun howToGo()
}

interface Place {
    var max_far: Int
}

class House : TwoInterfaceDemo, Place {
    override var name: String = "Moe Win"

    override var address: String = "Hlaing"

    override fun howToGo() {
        println("$name whose is going to $address")
    }

    override var max_far: Int = 1000
}

fun main(args: Array<String>) {

    var place = House()
    place.howToGo()
    place.whereGo()

}