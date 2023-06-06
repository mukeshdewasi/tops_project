package assignment_topic_function
fun main() {
    print("enter the first number")
    var power= readLine()!!.toInt()
    print("enter the second number ")
    var power1= readLine()!!.toInt()
    val result = power(power, power1)

    println("$result")
}

fun power(base: Int, power2: Int): Int {
    if (power2 != 0)
        return base * power(base, power2 - 1)
    else
        return 1
}