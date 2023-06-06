package assignment_topic_function

fun main() {
    print("enter the first number")
    var low= readLine()!!.toInt()
    print("enter the second number")
    var high= readLine()!!.toInt()
    while (low < high) {
        if (PrimeNumber(low))
            print(low.toString() + " ")
        ++low
    }
}

fun PrimeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}