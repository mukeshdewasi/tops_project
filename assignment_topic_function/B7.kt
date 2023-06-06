package assignment_topic_function

fun main() {
    print("enter the number")
    var number= readLine()!!.toInt()
    var sum = Numbers(number)
    println("Sum = $sum")
}

fun Numbers(num: Int): Int {
    if (num != 0)
        return num + Numbers(num - 1)
    else
        return num
}