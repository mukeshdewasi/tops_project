package assignment_topic_function

fun countRuns(array: IntArray): Int {
    var count = 0
    var currentRun = array[0]

    for (i in 1 until array.size) {
        if (array[i] != currentRun) {
            count++
            currentRun = array[i]
        }
    }

    count++

    return count
}

fun main() {
    val array1 = intArrayOf(1, 1, 1, 2, 2)
    val array2 = intArrayOf(3, 4)
    val array3 = intArrayOf(1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0)

    val runCount1 = countRuns(array1)
    val runCount2 = countRuns(array2)
    val runCount3 = countRuns(array3)

    println("Run count in array1: $runCount1")
    println("Run count in array2: $runCount2")
    println("Run count in array3: $runCount3")
}