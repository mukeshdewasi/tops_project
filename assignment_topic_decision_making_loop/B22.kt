   fun main()
   {
    print("enter the number")
    var number1= readLine()!!.toInt()
    var number2: Int
    var number3: Int
    var number4 = 0

    number2= number1
    while (number2 != 0) {
        number3 = number2 % 10
        number4 += Math.pow(number3.toDouble(), 3.0).toInt()
        number2 /= 10
    }

    if (number4 == number1)
    {
        print("Armstrong Number ")
    }
    else
    {
        println("not a Armstrong number")
    }
}