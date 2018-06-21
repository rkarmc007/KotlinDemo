fun main(args: Array<String>) {

    printDay(1)
    printDay(2)
    printDay("Sat")

}


fun printDay(n: Any) {

    when (n) {
        1 -> {
            println("Sunday")
        }
        "Sat" ->{
            println("Saturday")
        }
        2 -> {
            println("Monday")
        }
        "Fri" ->{
            println("Friday")
        }

        else -> {
            println("Invalid value")
        }
    }

}