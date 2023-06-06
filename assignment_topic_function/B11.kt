package assignment_topic_function

fun main() {
    print("enter the decimal number")
    var decimal= readLine()!!.toInt()
    val octal = calculation(decimal)
    println("$octal in octal")
}

fun calculation(decimal: Int): Int {
    var decimal = decimal
    var octalNumber = 0
    var i = 1

    while (decimal != 0) {
        octalNumber += decimal % 8 * i
        decimal /= 8
        i *= 10
    }

    return octalNumber
}