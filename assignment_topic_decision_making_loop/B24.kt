package assignment_topic_decision_making_loop

fun main()
{
    print("enter the factorial number")
    var number= readLine()!!.toInt()
    print("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}