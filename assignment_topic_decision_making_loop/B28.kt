package assignment_topic_decision_making_loop

fun main() {
    print("enter the element")
    var number= readLine()!!.toInt()
    for (i in 1..number)
    {
        for (j in 1..i)
        {
            print("*")
        }
        println()
    }
}