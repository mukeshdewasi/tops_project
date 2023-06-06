package assignment_topic_function

fun multiplyNumbers(num1: Int?, num2: Int?): Int? {
    if (num1 != null && num2 != null) {
        return num1 * num2
    }
    return null
}

fun main() {
    val number1: Int? = 5
    val number2: Int? = 10

    val result = multiplyNumbers(number1, number2)
    if (result != null) {
        println("Result: $result")
    } else {
        println("Invalid input. Both numbers must be non-null.")
    }
}