package assignment_topic_decision_making_loop

fun main()
{
    print("enter the value ")
    var value= readLine()!!.toInt()
    print("enter the power value ")
    var power= readLine()!!.toInt()
    var result: Long = 1

    while (power != 0) {
        result *= value.toLong()
        --power
    }

    println("power value = $result")

}