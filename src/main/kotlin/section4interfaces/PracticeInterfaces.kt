package section4interfaces

fun main() {
    // Question 1
    val rest1: Restaurant = Casino()
    rest1.provideFood()
    rest1.provideBill()

    val rest2: Restaurant = HumptyDumpty()
    rest2.provideFood()
    rest2.provideBill()

    // Question 2
    val factory = CarFactory()
    val myCar: Car = factory.provideCar()
    myCar.speed = 90
    myCar.drive()
    myCar.park()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class HumptyDumpty: Restaurant {
    override fun provideFood() {
        println("Humpty Dumpty provides food and drinks")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}

class Casino: Restaurant {
    override fun provideFood() {
        println("This is the most delicious food I have ever tried")
    }

    override fun provideBill() {
        println("PLease pay 100")
    }
}

interface Car {
    var speed: Int
    fun drive()
    fun park()
}

class Bmw: Car {
    override var speed: Int = 250

    override fun drive() {
        println("BMW is driving at ${this.speed} Km/h")
    }

    override fun park() {
        println("BMW is parking")
    }
}

class CarFactory {
    fun provideCar(): Car {
        return Bmw()
    }
}

