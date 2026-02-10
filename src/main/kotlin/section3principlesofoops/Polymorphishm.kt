package section3principlesofoops

fun main() {
    val dad = Dad()
    val son = Son()

    dad.say("Hello")
    son.say("Hi")
    dad.say()
    dad.say("Hello son", 3)
    dad.say(4)
}

open class Dad {
    open fun say(message: String) {
        println("Dad says $message")
    }

    fun say() {
        println("Dad says hi")
    }

    fun say(message: String, times: Int) {
        for (i in 1..times) {
            println("$i Day says $message")
        }
    }

    fun say(times: Int) {
        for (i in 1..times) {
            println("$i Dad says hi")
        }
    }
}

class Son: Dad() {
    override fun say(message: String) {
        println("Son says $message")
    }
}