package section2moreaboutclasses

fun main() {
    // Question 1
    val table1 = Table()
    println("This table has ${table1.legs} legs and height is ${table1.height} feet")

    val table2 = Table(4)
    println("This table has ${table2.legs} legs and height is ${table2.height} feet")

    val table3 = Table(2, 1)
    println("This table has ${table3.legs} legs and height is ${table3.height} feet")
}

class Table {
    var legs: Int = 0
    var height: Int = 0

    constructor() {
        legs = 4
        height = 4
    }

    constructor(newLegs: Int) {
        legs = newLegs
        height = 3
    }

    constructor(newLegs: Int, newHeight: Int) {
        legs = newLegs
        height = newHeight
    }
}