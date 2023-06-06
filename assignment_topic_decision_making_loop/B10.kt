package assignment_topic_decision_making_loop

fun main()
{
        var fact :Long=1
        print("enter the  number")
        var i= readLine()!!.toInt()
        for (number in 1..i )
        {
                fact=fact*number

        }
        print("factorial number$fact")

}