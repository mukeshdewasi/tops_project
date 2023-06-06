package assignment_topic_function
fun main() {
    print("enter the first number")
    var num1= readLine()!!.toInt()
    print("enter the second number")
    var num2= readLine()!!.toInt()
    val hcf = dispaly(num1, num2)

    println("G.C.D of $num1 and $num2 is $hcf.")
}
fun dispaly(num3: Int, num4: Int): Int {
    if (num4 != 0)
        return dispaly(num4, num3 % num4)
    else
        return num3
}