fun main()
{
    println("use for a kotlin calculator")
    print("enter the first number")
    var a= readLine()!!.toDouble()
    print("enter the second number")
    var b= readLine()!!.toInt()
    println("""
        1. addition 
        2. substraction
        3. multiplicatoin 
        4. divide
    """.trimIndent())
    print("enter choice")
    var c= readLine()!!.toInt()
    when(c)
    {
        1 -> print("a+b ${ a+b }")
        2 -> print("a-b ${ a-b }")
        3 -> print("a*b ${ a*b }")
        4 -> print("a/b ${ a/b }")

    }

}