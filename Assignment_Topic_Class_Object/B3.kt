package Assignment_Topic_Class_Object

data class user(val name: String, val age: Int)

fun main() {
    val person1 = Person("dixit", 30)
    val person2 = Person("rakesh", 25)

    println(person1)
    println(person2)

    println("Are person1 and person2 equal? ${person1 == person2}")

    val person3 = person1.copy(age = 35)
    println(person3)
}