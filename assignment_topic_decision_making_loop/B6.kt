package assignment_topic_decision_making_loop

fun main()
{
        print("enter the year")
        var year= readLine()!!.toInt()
        if (year % 4 == 0)
        {
            print("leap year")
        }
        else
        {
            print("not leap year")
        }
}