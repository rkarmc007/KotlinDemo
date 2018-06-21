data class Boss(val name: String = "", val age: Int = 0)

fun main(args: Array<String>) {
    var name: String = "No name"
    name.length
    var users: ArrayList<Boss> = ArrayList()
    users.add(Boss("Ag Ag", 40))
    users.add(Boss("Kyaw", 45))
    println(users[0])
}