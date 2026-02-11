package section6othertypesofclasses

fun main() {
    val myUser1 = User1("alex", "alex@gmail.com", "123")
    println(myUser1)

    val myUser2 = User1("bob", "bob@gmail.com", "345")
    println(myUser2)

    println(myUser1 == myUser2)

    println(myUser1.toString())

    val myUser3 = myUser2.copy(email = "bob1@gmail.com")
    println(myUser3)
}

data class User1(
    val name: String,
    val email: String,
    val password: String
)