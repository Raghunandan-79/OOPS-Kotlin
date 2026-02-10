package section5standardfunctions

fun main() {
    Restaurant().run {
        standardDish = "Dal rice"
        todaySpecial = "Amritsari kulcha"
        printMenu()
    }
}

class Restaurant {
    var standardDish: String = ""
    var todaySpecial: String = ""

    fun printMenu() {
        println("Menu:\n" +
                "#1. Standard dish: ${this.standardDish}\n" +
                "#2. Today's special: ${this.todaySpecial}")
    }
}
