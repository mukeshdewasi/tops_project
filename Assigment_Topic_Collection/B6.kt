package Assigment_Topic_Collection

fun main() {
    // Convert Array to Set
    val array = arrayOf("Apple", "Banana", "Orange")
    val set = array.toHashSet()

    println("Array: ${array.contentToString()}")
    println("Set: $set")

    // Convert Set to Array
    val newSet = setOf("Mango", "Grapes", "Pineapple")
    val newArray = newSet.toTypedArray()

    println("New Set: $newSet")
    println("New Array: ${newArray.contentToString()}")
}
