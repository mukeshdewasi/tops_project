package assignment_topic_function

val data: String by lazy {
    println("Calculating expensiveData...")
    Thread.sleep(2000)
    "Hello, Lazy!"
}

fun main() {
    println("Before accessing expensiveData.")
    println(data)
    println(data)
    println("After accessing expensiveData.")
}