package Assignment_Topic_Array

fun main(argument: Array<String>) {
    if (argument.isEmpty()) {
        println("Error: Missing name argument.")
    } else {
        val name = argument[0]
        println("Hello, $name!")
    }
}