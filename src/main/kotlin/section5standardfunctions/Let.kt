package section5standardfunctions

fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
        .let { filteredList ->
            println(filteredList)
            println("Size of list is ${filteredList.size}")
        }
}