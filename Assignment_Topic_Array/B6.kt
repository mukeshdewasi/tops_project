package Assignment_Topic_Array

fun main() {
    var rows = 2
    var columns = 3
    var firstMatrix = arrayOf(intArrayOf(5, 9, 3), intArrayOf(4, 6, 2))
    var secondMatrix = arrayOf(intArrayOf(7, 6, 8), intArrayOf(9, 6, 4))
    var multiply = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            multiply[i][j] = firstMatrix[i][j] * secondMatrix[i][j]
        }
    }
    println("multiply of two matrices is: ")
    for (row in multiply) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}