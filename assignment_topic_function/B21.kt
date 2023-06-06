package assignment_topic_function

fun Even(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter(::Even)

    println("Even numbers: $evenNumbers")
}