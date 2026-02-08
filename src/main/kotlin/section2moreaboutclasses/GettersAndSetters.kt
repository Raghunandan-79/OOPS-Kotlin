package section2moreaboutclasses

fun main() {
    val myCar = Car3()
    myCar.speed = 100
    println("myCar.name ${myCar.name}")
    println("myCar.speed ${myCar.speed}")
}

class Car3 {
    var name = ""
    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High speed car $value"
            field = value
        }
}