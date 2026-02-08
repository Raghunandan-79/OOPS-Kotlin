package section2moreaboutclasses

fun main() {
    val account = BankAccount()
    account.account = 300
    account.account = 400
    account.account = 100
}

class BankAccount {
    var creditRating = 500
    var account: Int = 0
        set(value) {
            if (value > account) {
                creditRating++
            } else {
                creditRating--
            }

            field = value
            println("New credit rating is $creditRating")
        }
}