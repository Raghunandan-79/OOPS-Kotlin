package section2moreaboutclasses

fun main() {
    // Question 1
    println(KotlinCourse.displayGeneralInfo())
}

class KotlinCourse {
    companion object {
        fun displayGeneralInfo(): String {
            return "This course can be taken without any pre requisite knowledge"
        }
    }
}

