package section1oop

fun main() {
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "BMW M4 competition"
    myCar.topSpeed = 320
    myCar.start()
    myCar.drive(69)
    println("Top speed of ${myCar.model} is ${myCar.topSpeed}")

    yourCar.model = "Ford Mustang"
    yourCar.start()
    yourCar.drive(67)
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}