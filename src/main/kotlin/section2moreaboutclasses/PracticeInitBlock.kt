package section2moreaboutclasses

fun main() {
    val myLaptop = Laptop()
    myLaptop.setOperatingSystem("Fedora Linux: KDE Plasma")
    println("Laptop is running on ${myLaptop.getOperatingSystem()}")
}

class Laptop {
    var operatingSystemUsed: String = "Windows"

    init {
        println("$operatingSystemUsed is being installed on this laptop")
    }

    fun setOperatingSystem(operatingSystem: String) {
        this.operatingSystemUsed = operatingSystem
    }

    fun getOperatingSystem() = this.operatingSystemUsed
}