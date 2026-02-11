package section6othertypesofclasses

fun main() {
    val myUser = User("John", "john@gmail.com", "123")
    println(myUser)
    println(myUser.name)
    println(myUser.email)
    println(myUser.password)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)