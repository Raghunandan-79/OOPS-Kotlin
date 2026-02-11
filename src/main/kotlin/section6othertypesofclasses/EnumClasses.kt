package section6othertypesofclasses

fun main() {
    print("Enter color (RED, BLUE, GREEN): ")
    val input = readln().uppercase()
    val color = Colors.valueOf(input)
    when (color) {
        Colors.RED -> println("You chose red")
        Colors.BLUE -> println("You chose blue")
        Colors.GREEN -> println("You chose green")
    }

    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
}

enum class Colors(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(45)
}