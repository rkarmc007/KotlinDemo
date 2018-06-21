fun main(args: Array<String>) {
    var str = "Kotlin TutorialofExamplesdemoAndroidminDemo"
    var dem = "of"
    var dem1 = "demo"
    var dem2 = "min"

    var output = str.split(dem, dem1, dem2)
    var result = str.split(Regex("of|demo|min"))

    println(output)
    println(result)
}