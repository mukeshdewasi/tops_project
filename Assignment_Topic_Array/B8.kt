package Assignment_Topic_Array

fun main() {
    var r1 = 2
    var c1 = 3
    var r2 = 3
    var c2 = 2
    var firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
    var secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))
    var product = multiplyMatrices(firstMatrix,
        secondMatrix,
        r1,
        c1,
        c2)
    displayProduct(product)
}

fun multiplyMatrices(firstMatrix: Array <IntArray>,
                     secondMatrix: Array <IntArray>,
                     r1: Int,
                     c1: Int,
                     c2: Int): Array <IntArray> {
    var product = Array(r1) { IntArray(c2) }
    for (i in 0..r1 - 1) {
        for (j in 0..c2 - 1) {
            for (k in 0..c1 - 1) {
                product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }

    return product
}

fun displayProduct(product: Array <IntArray>) {
    println("Product of two matrices is: ")
    for (row in product) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}
