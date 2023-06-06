package assignment_topic_decision_making_loop

fun main() {
    print("enter the first number")
    var n1= readLine()!!.toInt()
    print("enter the second value")
    var n2= readLine()!!.toInt()
    var lcm: Int

    // maximum number between n1 and n2 is stored in lcm
    lcm = if (n1 > n2) n1 else n2

    // Always true
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $lcm.")
            break
        }
        ++lcm
    }
}