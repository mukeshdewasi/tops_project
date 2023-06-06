fun main()
{
        print("enter the first value")
        var a= readLine()!!.toInt()
        print("enter the second value")
        var b= readLine()!!.toInt()
        print("enter the third value")
        var c= readLine()!!.toInt()
        if(a>b) {
            if (a > c) {
                print("a is grater")

            } else {
                print("c is greater")
            }
        }
    else{
        if (b>c)
        {
            println("b is greater")
        }
            else
        {
            println("c is greater")
        }
        }
}