package assignment_topic_function

fun StringLength(text: String?) {
    if (text is String) {
        println("Length of the string: ${text.length}")
    } else {
        println("Invalid input valid string.")
    }
}

fun main() {
    val value: String? = "Hello, World!"

    StringLength(value)
}
