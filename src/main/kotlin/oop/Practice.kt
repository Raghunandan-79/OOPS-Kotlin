package oop

fun main() {
    // Question 1
    val lion = Animal()
    lion.name = "Lion"
    lion.topSpeed = 60
    lion.run()
    lion.topSpeed = 80
    lion.run()
    println()

    // Question 2
    val math = Math()
    println(math.add(5, 2))
    println(math.sub(5, 2))
    println(math.mul(5, 2))
    println(math.divide(5, 2))

    // Question 3
    val jetpack = Jetpack()
    jetpack.burn(10)
    jetpack.stop(2)
}

private class Animal {
    var name = ""
    var topSpeed: Int = 0

    fun run() {
        println("$name is running at top speed of $topSpeed Km/h")
    }
}

private class Math {
    fun add(num1: Int, num2: Int): Int {
        return (num1 + num2)
    }

    fun sub(num1: Int, num2: Int): Int {
        return (num1 - num2)
    }

    fun mul(num1: Int, num2: Int): Int {
        return (num1 * num2)
    }

    fun divide(num1: Int, num2: Int): Double {
        return (num1 / num2).toDouble()
    }
}

private class Jetpack {
    var userHeight: Int = 0

    fun burn(numberOfSeconds: Int) {
        userHeight += numberOfSeconds
        println("After burning for $numberOfSeconds height of user is $userHeight meters")
    }

    fun stop(numberOfSeconds: Int) {
        val heightToDescend = numberOfSeconds * 3
        userHeight -= heightToDescend

        if (userHeight < 0) {
            userHeight = 0
        }

        println("After stopping for $numberOfSeconds height of user is $userHeight meters")
    }

}