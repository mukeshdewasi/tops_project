package assignment_topic_function.Assignment_Level_Advanced

fun findPairless(numbers: IntArray): Int {
    var result = 0
    for (number in numbers) {
        result = result xor number
    }
    return result
}

fun main() {
    val array1 = intArrayOf(1, 2, 1, 2)
    val array2 = intArrayOf(1, 1, 1)

    val lonelyNumber1 = findPairless(array1)
    val lonelyNumber2 = findPairless(array2)

    println("Lonely number in array1: $lonelyNumber1")
    println("Lonely number in array2: $lonelyNumber2")
}