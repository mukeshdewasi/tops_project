package assignment_topic_function

import kotlin.properties.Delegates

class Person {
    var name: String by Delegates.notNull()

    fun initializeName(name: String) {
        this.name = name
    }

    fun printName() {
        println("Name: $name")
    }
}

fun main() {
    val person = Person()


    person.initializeName("dixit")
    person.printName()
}