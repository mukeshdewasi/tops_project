package assignment_topic_function

fun main() {
    val number = 10
    val rangeStart = 1
    val rangeEnd = 5

    if (number !in rangeStart..rangeEnd) {
        println("The number is outside the range.")
    } else {
        println("The number is within the range.")
    }
}