package section4interfaces

fun main() {
    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.feed()
    myFood = FrenchRestaurant().todaySpecial()
    myFood.feed()
}

interface Food {
    fun feed()
}

class FastFood: Food {
    override fun feed() {
        println("Fast food will feed you")
    }
}

class FrenchFood: Food {
    override fun feed() {
        println("French food will feed you and delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchRestaurant {
    fun todaySpecial(): Food {
        return FrenchFood()
    }
}