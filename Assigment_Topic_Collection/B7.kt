package Assigment_Topic_Collection

fun main() {
    val map = mapOf("Apple" to 10, "Banana" to 5, "Orange" to 8)
    val sortedMap = map.toList()
        .sortedBy { it.second }
        .toMap()

    println("Original Map: $map")
    println("Sorted Map: $sortedMap")
}
