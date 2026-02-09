package section3principlesofoops

fun main() {
    val jug = Jug()
    jug.pour()

    val bottle = Bottle()
    bottle.pour()
}

abstract class Container {
    abstract fun pour()
}

class Bottle: Container() {
    override fun pour() {
        println("Pouring water from bottle")
    }
}

class Jug: Container() {
    override fun pour() {
        println("Pouring water from jug")
    }
}