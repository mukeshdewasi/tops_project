package Assignment_Topic_Class_Object

class student(val name: String) {
    fun greet() {
        println("Hello, $name! Welcome to our program.")
    }
}

fun main() {
    print("Enter your name: ")
    val name = readLine()

    val greeting = student(name ?: "")
    greeting.greet()
}