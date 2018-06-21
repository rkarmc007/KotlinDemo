fun main(args: Array<String>) {

    var profile = Profile("Aung Thu")

    profile.doAll()

}

open class Contact(var role: String = "Friend", var name: String = "X") {
    open fun reading() {
        println(name + "is reading")
    }
}

class Profile(name: String) : Contact("user", name) {

    override fun reading() {
        println("$name is a $role,whose is reading")
    }

    fun doAll(){
        reading()
    }
}