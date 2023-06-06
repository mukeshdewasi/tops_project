package assignment_topic_function

fun main() {
    val number = listOf(10,5,6,17,87,12)
    val maxValue = number.maxByOrNull { it }
    println("The  maximum value is $maxValue")
}