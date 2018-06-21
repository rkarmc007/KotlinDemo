fun main(args: Array<String>) {
    var vehicle = Aeroplane()
    vehicle.howToRun()
}

abstract class Vehicle() {
    var name: String = "Not specified"

    abstract var medium: String

    fun runsWhere() {
        println("The vehicle,$name is running on $medium ")
    }

    abstract fun howToRun()
}

class Aeroplane : Vehicle() {

    override var medium: String = "air"


    override fun howToRun() {
        println("Aeroplane fly base on buoyancy force")
    }

}