package section4interfaces

fun main() {
    val child = Child()
    child.raisePet()
}

interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun feed()
}

class Puppy: Pet {
    override var cutenessLevel: Int = 100

    override fun startPlaying() {
        println("Dogs play by running, jumping, barking")
    }

    override fun feed() {
        println("Give dog treats")
    }
}

class Child {
    var pet: Pet? = null

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        pet?.startPlaying()
        pet?.feed()
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}