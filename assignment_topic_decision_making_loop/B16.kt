package assignment_topic_decision_making_loop

fun main()
{
    println("enter the integer number")
    var value= readLine()!!.toInt()
    var result=0
    while (value !=0 )
    {
        value /= 10
        result++

    }
    print("result $result")

}