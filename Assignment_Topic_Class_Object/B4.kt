package Assignment_Topic_Class_Object

data class item(val name: String, val age: Int)

fun main() {
    val person1 = Person("dinesh", 30)
    val person2 = Person("rakesh", 25)

    println(person1) // toString()

    val person3 = person1.copy(age = 35) // copy()
    println(person3)

    val person4 = Person("John Doe", 30)
    val person5 = Person("John Doe", 30)

    println("Are person1 and person4 equal? ${person1 == person4}") // equals()
    println("Are person1 and person5 equal? ${person1 == person5}")
}