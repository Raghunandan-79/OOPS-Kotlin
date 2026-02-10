package section4interfaces

fun main() {
    val bosch = Bosch()
    bosch.name = "Bosch"
    bosch.turnOn()
    bosch.cook(5)
    bosch.turnOff()
}

interface Oven {
    var temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        this.temperature = temp
        println("Cooking at ${this.temperature} degree")
    }
}

class Bosch: Oven {
    var name: String = ""
    override var temperature: Int = 5

    override fun turnOn() {
        println("Turning on ${this.name} oven")
    }

    override fun turnOff() {
        println("Turning off ${this.name} oven")
    }
}