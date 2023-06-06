package assignment_topic_function

fun main() {

    print("enter the first number")
    var low= readLine()!!.toInt()
    print("enter the scond number")
    var high= readLine()!!.toInt()

    for (number in low + 1..high - 1) {
        if (Armstrong(number))
            print("$number ")
    }
}

fun Armstrong(num: Int): Boolean {
    var digits = 0
    var result = 0
    var originalNumber = num
    while (originalNumber != 0) {
        originalNumber /= 10
        ++digits
    }
    originalNumber = num
    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == num)
        return true

    return false
}


