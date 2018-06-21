fun main(args: Array<String>) {
    var student_1 = Student("Minn Minn")
    var teacher_1 = Teacher("Kyaw Kyaw")

    println("\n\nAbout "+student_1.name+"\n---------------")
    student_1.doAll()

    println("\n\nAbout "+teacher_1.name+"\n---------------")
    teacher_1.doAll()
}


open class Player(var role: String = "Admin", open var name: String = "X") {
    fun eating() {
        println(name + " is eating")
    }

    fun sleeping() {
        println(name + " is sleeping")
    }
}

class Student(override var name: String) : Player ("Employee",name){

    fun activity(){
        println("$name  is a $role,doing ...")
    }

    fun doAll() {
        activity()
        eating()
        sleeping()
    }
}

class Teacher(override var name: String): Player("Teacher",name){
    fun doAll() {
        eating()
        sleeping()
    }

}