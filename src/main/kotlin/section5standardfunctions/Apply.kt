package section5standardfunctions

fun main() {
    val myCar = MyCar().apply {
        speed = 50
        color = "Chrome"
        startCar()
    }

    println(myCar)
}

class MyCar {
    var speed = 10
    var color = "Black"
    fun startCar() {
        println("Starting the car, speed is ${this.speed}, color is ${this.color}")
    }
}