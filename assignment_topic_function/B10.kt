package assignment_topic_function
fun main() {
    var num:Long = 110110111
    var decimal = BinaryToDecimal(num)
    println("$num in binary = $decimal in decimal")
}

fun BinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}