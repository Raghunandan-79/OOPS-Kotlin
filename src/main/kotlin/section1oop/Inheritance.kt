package section1oop

fun main() {
    val myDog = Corgi()
    myDog.size = 10
    println("My dog size is: ${myDog.size}")
    myDog.bark()
    myDog.play()
}

open class Dog {
    var size: Int = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi: Dog()