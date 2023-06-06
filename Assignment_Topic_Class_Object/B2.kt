package Assignment_Topic_Class_Object

data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("dixit", 30)

    val (name, age) = person

    println("Name: $name")
    println("Age: $age")
}