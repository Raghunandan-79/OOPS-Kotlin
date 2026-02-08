package section2moreaboutclasses

fun main() {
    // Question 1
    val box = Box()
    println("Contents is ${box.contents}")
    box.updateContents("jewellery")
    println("Contents is ${box.contents}")
}

class Box {
    var contents: String = ""

    fun updateContents(contents: String) {
        this.contents = contents
    }
}