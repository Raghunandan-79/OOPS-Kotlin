package section3principlesofoops

fun main() {
    val carol = Daughter("French")
    println("Hair color of Carol is ${carol.hairColor}")
    println("Eye color of Carol is ${carol.eyeColor}")
    carol.say("Bonjour")
    println("Native tongue of Carol is ${carol.nativeTongue}")
}

open class Mom(val nativeTongue: String) {
    open val hairColor = "brown"
    val eyeColor = "blue"

    open fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "Blonde"

    override fun say(message: String) {
        super.say("Hi")
        println("Carol says $message")
    }
}