enum class MobileColor(val value: Int) {
    GOLD(0xffd323),
    SILVER(0xeaeaea),
    WHITE(0xffffff),
    BLACK(0x000000),
    RED(0xFF0000)
}

data class Mobile(val name: String, var color: MobileColor)

fun main(args: Array<String>) {
    val mobile = Mobile("Samsung", MobileColor.BLACK)
    val mobile1 = Mobile("RedMi", MobileColor.SILVER)

    println(mobile.name + "-${mobile.color}")
    println(mobile1.name + "-${mobile1.color}")
}