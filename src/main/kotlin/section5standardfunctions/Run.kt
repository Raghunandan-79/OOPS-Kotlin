package section5standardfunctions

fun main() {
    val bus = Bus().run {
        speed = 80
        drive()
        println("Bus is driving")
        this
    }

    println(bus)

    Bus().run {
        speed = 69
        drive()
        println("Bus is driving")
    }

    run {
        val bus = Bus()
        bus.speed = 60
        bus.drive()
        println("Bus is driving")
    }
}

class Bus {
    var speed: Int = 10
    fun drive() {
        println("Bus is driving at ${this.speed}")
    }
}