package assignment_topic_function

import kotlin.properties.Delegates

var name: String by Delegates.observable("John Doe") { _, oldValue, newValue ->
    println("Name changed from '$oldValue' to '$newValue'")
}

fun main() {
    println("Initial name: $name")

    name = "dixit"
    name = "nikhil"
}