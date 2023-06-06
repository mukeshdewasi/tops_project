package assignment_topic_function.Assignment_Level_Advanced

fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty()) {
        return null
    }

    var maxIndex = 0
    var maxValue = a[0]

    for (i in 1 until a.size) {
        if (a[i] > maxValue) {
            maxValue = a[i]
            maxIndex = i
        }
    }

    return maxIndex
}

fun main() {
    val array1 = intArrayOf(5, 3, 9, 2, 7)
    val array2 = intArrayOf()

    val maxIndex1 = indexOfMax(array1)
    val maxIndex2 = indexOfMax(array2)

    println("Index of the largest element in array1: $maxIndex1")
    println("Index of the largest element in array2: $maxIndex2")
}