interface Football {

    var name: String
    var medium: String

    fun wherePlay() {
        println("Footballer $name is play in $medium")
    }

    fun howItPlay()
}

class Messi : Football {
    override var name: String = "Messi"

    override var medium: String = "NuCamp"


    override fun howItPlay() {
        println("$name play in $medium")
    }

}

fun main(args: Array<String>) {
    var football = Messi()
    football.wherePlay()
    football.howItPlay()
}