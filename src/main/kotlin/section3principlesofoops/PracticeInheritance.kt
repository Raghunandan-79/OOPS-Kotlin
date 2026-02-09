package section3principlesofoops

fun main() {
    val parakeet = Parakeet()
    println("Color of parakeet is: ${parakeet.color}")
    parakeet.fly()
}

open class Bird {
    open val color: String = "Blue"
    open val speed: Int = 10

    open fun fly() {
        println("A ${this.color} bird can fly up to ${this.speed} kph")
    }
}

class Parakeet: Bird() {
    override val color: String = "Green"
    override val speed: Int = 20

    override fun fly() {
        super.fly()
        println("A ${super.color} bird can fly up to ${super.speed} kph")
    }
}