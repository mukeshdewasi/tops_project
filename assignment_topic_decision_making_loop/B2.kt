package assignment_topic_decision_making_loop

fun main()
{
        println("enter the name")
        var name= readLine()!!.toString()
        when(name) {
            "print1" -> print("hello")
            "print2" -> print("salut")
            "print3" -> print("ciao")
            else -> print("no statement")
        }
}
