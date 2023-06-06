package Assigment_Topic_Collection

class User(var name: String, var age: Int)

fun main() {
    val userProperties = mapOf("name" to "dixit", "age" to 30)

    val user = User("", 0)

    user.name = userProperties["name"] as String
    user.age = userProperties["age"] as Int

    println("User: ${user.name}, Age: ${user.age}")
}