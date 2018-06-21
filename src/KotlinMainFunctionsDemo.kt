fun main(args: Array<String>) {
    val user1 = User("Minn",18)
    printUser(user1)
}

fun printUser(user: User){
    println(user)
}

data class User(val name:String,val age:Int)