package section2moreaboutclasses

fun main() {
    val message = PostItNote()
    println(message.message)
    message.updateMessage("Meeting at 5")
    println(message.message)
}

class PostItNote {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }
}