package assignment_topic_decision_making_loop

fun main()
{
    print("enter the table name")
    var num= readLine()!!.toInt()
    for(i in 1..10)
    {
     var result=i*num

        println("$num*$i=$result")

    }
    for(i in 1..10)
    {
        var result=i*num

        println("$num*$i=$result")

    }
}