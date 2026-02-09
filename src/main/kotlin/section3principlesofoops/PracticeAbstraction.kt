package section3principlesofoops

fun main() {
    val pug = Pug("Pug")
    pug.run()
    pug.bark()
    pug.play()

    val bassetHound = BassetHound("Basset Hound")
    bassetHound.run()
    bassetHound.bark()
    bassetHound.play()

    val chihuahua = Chihuahua("Chihuahua")
    chihuahua.run()
    chihuahua.bark()
    chihuahua.play()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class BassetHound(val name: String): Dog(name) {
    override fun run() {
        println("A $name cannot run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}


class Chihuahua(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name cannot play")
    }
}