package assignment_topic_decision_making_loop
fun main() {
    print("enter the value")
    var value = readLine()!!.toInt()
    var reverse = 0
    while (value != 0) {
        var result = value % 10
        reverse = reverse * 10 + result
        value /= 10
    }
    print("reverse value $reverse")
}