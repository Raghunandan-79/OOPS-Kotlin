package section1oop

fun main() {
    DatabaseAccess.connect()
    println("Connected database: ${DatabaseAccess.connected}")
    DatabaseAccess.disconnect()
    println("Connected to database: ${DatabaseAccess.connected}")
}

private object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from database")
    }
}