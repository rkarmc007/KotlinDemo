fun main(args: Array<String>) {
    val person = Person("Aung Aung", 20,"football player")
    person.prinPersonDetail()
}

open class Person (open var name: String, var age: String) {
    var profession: String = "not mentioned"


    constructor(name: String, age: Int, profession: String) : this(name, age.toString()) {
        this.profession = profession
    }

    fun prinPersonDetail() {
        println("$name whose profession $profession,age is $age years old")
    }


}