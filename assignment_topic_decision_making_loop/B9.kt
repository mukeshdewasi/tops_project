package assignment_topic_decision_making_loop

fun main() {
    var sum=0
    print("enter the number ")
    var number = readLine()!!.toInt()
    for (i in 1..number)
    {
        sum+=i

    }
    print("sum$sum")


}