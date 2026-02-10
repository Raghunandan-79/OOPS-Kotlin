package section5standardfunctions

fun main() {
    // Question 1
    with(Person()) {
        firstName = "Raghunandan"
        lastName = "Sharma"
        age = 21
        printInformation()
    }

    // Question 2
    with(Store()) {
        shoes = 100
        shirts = 50
        jackets = 10
        printInventory()
    }
}

class Person {
    var firstName: String = ""
    var lastName: String = ""
    var age:Int = 1

    fun printInformation() {
        println("Firstname is: ${this.firstName}\n" +
                "Lastname is: ${this.lastName}\n" +
                "Age is: ${this.age}")
    }
}

class Store {
    var shoes: Int = 0
    var shirts: Int = 0
    var jackets: Int = 0

    fun printInventory() {
        println("This store has ${this.shoes} shoes\n" +
                "This store has ${this.shirts} shirts\n" +
                "This store has ${this.jackets} jackets")
    }
}