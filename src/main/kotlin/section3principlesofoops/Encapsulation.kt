package section3principlesofoops

fun main() {
    val encryptionLock = EncryptionLock(40)
    println("Does the key 70 unlock my lock? : ${ encryptionLock.unlock(70) }")
}

class EncryptionLock(private val privateKey: Int) {
    fun unlock(publicKey: Int) = formula(publicKey) == privateKey

    private fun formula(publicKey: Int) = publicKey / 2 + 5
}