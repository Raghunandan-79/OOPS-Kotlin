package section2moreaboutclasses

fun main() {
    println(Car5.drivingInstruction())
}

class Car5 {
    companion object {
        fun drivingInstruction(): String {
            return "Drive safe"
        }
    }
}