fun main(args: Array<String>) {
    print("enter the number")
    var num1= readLine()!!.toInt()
    var num2 = 0
    var num3: Int
    val num4: Int

    num4 = num1

    // reversed integer is stored in variable
    while (num1 != 0) {
        num3 = num1 % 10
        num2  = num2  * 10 + num3
        num1 /= 10
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (num4 == num2 )
        println("  palindrome number.")
    else
        println(" not  palindrome number.")
}