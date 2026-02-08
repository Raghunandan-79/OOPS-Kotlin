package section2moreaboutclasses

fun main() {
    val myCar = Car("BMW", 280)
    println("Model is ${myCar.model} and top speed is ${myCar.topSpeed}")

    val myCar1 = Car1()
    println(myCar1.model)
    println(myCar1.topSpeed)

    val myCar2 = Car1("Mustang")
    println(myCar2.model)
    println(myCar2.topSpeed)

    val myCar3 = Car1("Polo GT", 220)
    println(myCar3.model)
    println(myCar3.topSpeed)
}

class Car(var model: String, var topSpeed: Int)

class Car1 {
    var model: String? = null
    var topSpeed = 100

    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }
}