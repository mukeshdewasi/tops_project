package assignment_topic_function

fun sum(array: IntArray): Int {
    var sum = 0
    for (element in array) {
        sum += element
    }
    return sum
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    val result = sum(numbers)

    println("Sum: $result")
}