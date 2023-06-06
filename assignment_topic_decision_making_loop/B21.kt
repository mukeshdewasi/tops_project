package assignment_topic_decision_making_loop

fun main() {
    print("enter the first number")
    var num1= readLine()!!.toInt()
    print("enter the second number ")
    var num2= readLine()!!.toInt()

    while (num1 < num2) {
        var result = false

        for (i in 2..num1 / 2) {
            if (num1 % i == 0) {
                result = true
                break
            }
        }

        if (!result)
            println("primenumber$num1 ")

        ++num1
    }
}