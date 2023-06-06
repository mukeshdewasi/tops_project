package Assignment_Topic_Array

fun main() {
    val numArray = arrayOf(45, 67, 455, 20, 33, 45)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is $average")
}