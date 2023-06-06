package assignment_topic_function.Assignment_Level_Advanced

fun main() {
    val numbers = listOf(1, 3, 5, 6, 7, 9)

    val containsEven = numbers.any { it % 2 == 0 }

    if (containsEven) {
        println("The collection contains at least one even number.")
    } else {
        println("The collection does not contain any even number.")
    }
}