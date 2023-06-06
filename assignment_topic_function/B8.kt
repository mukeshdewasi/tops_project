package assignment_topic_function
fun main() {
    print("enter the number")
    var num= readLine()!!.toInt()
    val factorial = multiplyNumbers(num)
    println("Factorial of  = $factorial")
}
fun multiplyNumbers(num: Int): Long {
    if (num >= 1)
        return num * multiplyNumbers(num - 1)
    else
        return 1
}