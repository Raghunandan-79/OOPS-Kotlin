package section5standardfunctions

fun main() {
    Car().apply {
        speed = 80
        drive()
    }
        .also {
            println("Car is moving")
            println("Car speed is ${it.speed}")
        }
}