package assignment_topic_function

fun lengthEven(str: String): Boolean {
    return str.length % 2 == 0
}

fun filterStringsByLength(strings: List<String>): List<String> {
    return strings.filterNot(::lengthEven)
}

fun main() {
    val strings = listOf("Hello", "World", "Kotlin", "is", "awesome")

    val filteredStrings = filterStringsByLength(strings)

    println("Strings with odd length: $filteredStrings")
}