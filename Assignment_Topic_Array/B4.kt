package Assignment_Topic_Array

fun main() {
    val number = intArrayOf(15,75,57,54,554,)
    var largest = number[0]

    for (num in number) {
        if (largest < num)
            largest = num
    }

    println("Largest element =$largest")
}