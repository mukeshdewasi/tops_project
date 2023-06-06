package Assigment_Topic_Collection

fun main() {

    val list = listOf("dixit", "mukesh", "ram")
    val array = list.toTypedArray()

    println("List: $list")
    println("Array: ${array.contentToString()}")

    // Convert Array to List
    val newArray = arrayOf("dixit", "mukesh", "ram")
    val newList = newArray.toList()

    println("New Array: ${newArray.contentToString()}")
    println("New List: $newList")
}