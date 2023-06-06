package assignment_topic_decision_making_loop

fun main() {
    print("enter the number" )
    var number= readLine()!!.toInt()
    var t1 = 0
    var t2 = 1
    var sum=0
    for (i in 1..number) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    print("$t1")
}
