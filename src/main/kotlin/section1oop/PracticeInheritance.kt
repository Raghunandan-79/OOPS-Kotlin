package section1oop

fun main() {
    // Question 1
    val myLaptop = Laptop()
    myLaptop.name = "MSI Katana GF66 11UC"
    myLaptop.screenSize = 17
    myLaptop.speed = 1000

    val myApple = Apple()
    myApple.name = "Apple Macbook M3 AIR"
    myApple.screenSize = 13
    myApple.speed = 1200

    myLaptop.run()
    myApple.run()

    // Question 2
    val myBoeing = Boeing()
    myBoeing.name = "Boeing"
    myBoeing.speed = 400
    myBoeing.altitude = 12000
    myBoeing.ascend()
    myBoeing.altitude = 10000
    myBoeing.descend()

    val myAirbus = Airbus()
    myAirbus.name = "Airbus"
    myAirbus.speed = 500
    myAirbus.altitude = 14000
    myAirbus.ascend()
    myAirbus.altitude = 12000
    myAirbus.descend()
}

open class Laptop {
    var screenSize: Int = 0
    var speed: Int = 0
    var name: String = ""

    fun run() {
        println("$name has a screen size of $screenSize inch and speed of $speed GB/s")
    }
}

class Apple: Laptop()

open class Airplane {
    var speed: Int = 0
    var altitude: Int = 0
    var name: String = ""

    fun ascend() {
        println("$name is ascending at a speed of $speed Km/h and current altitude is $altitude feet")
    }

    fun descend() {
        println("$name is descending at a speed of $speed Km/h and current altitude is $altitude feet")
    }
}

class Boeing: Airplane()

class Airbus: Airplane()