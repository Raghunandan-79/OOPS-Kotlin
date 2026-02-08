package section2moreaboutclasses

fun main() {
    val myCar = Car4()
    myCar.model = "BMW"
    myCar.topSpeed = 220
    println("This car is ${myCar.model} and top speed is ${myCar.topSpeed}")
}

class Car4 {
    var model: String? = "No model"
    var topSpeed = 100

    init {
        println("Model: ${this.model} top speed ${this.topSpeed}")
    }
}