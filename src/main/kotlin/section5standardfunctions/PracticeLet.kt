package section5standardfunctions

fun main() {
    // Question 1
    print("Enter a number: ")
    val input: String? = readlnOrNull()
    input?.let {
        val number = it.toInt()
        println("The double of your number is ${number * 2}")
    }

    // Question 2
    val animals = arrayListOf<String?>()
    for (i in 1..3) {
        print("Input an animal: ")
        val input: String? = readlnOrNull()
        input?.let {
            if (it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }

    // Question 3
    val clients = arrayListOf<String?>()
    var bool = true
    do {
        print("Enter client name: ")
        val clientName: String? = readlnOrNull()
        clientName?.let {
            if (it == "") {
                clients.add(null)
            } else if(it.lowercase() == "stop") {
                bool = false
            } else {
                clients.add(clientName)
            }
        }
    } while (bool)

    clients.forEach {
        it?.let {
            println("Hello $it, how are you?")
        }
    }
}