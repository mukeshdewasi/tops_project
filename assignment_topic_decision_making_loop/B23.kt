package assignment_topic_decision_making_loop

fun main() {
    print("enter the first value")
    var num1 = readLine()!!.toInt()
    print("enter the second value")
    var num2 = readLine()!!.toInt()
    for (number in num1 + 1..num2 - 1) {
        var num3 = 0
        var num4 = 0
        var num5 = number
        while (num5 != 0) {
            num5 /= 10
            ++num3
        }
        num5 = number
        while (num5 != 0) {
            var num6 = num5 % 10
            num4 += Math.pow(num6.toDouble(), num3.toDouble()).toInt()
            num5 /= 10
        }
        if (num4 == number)
        {
            println(" Armstrong number $number")
        }
    }
}


