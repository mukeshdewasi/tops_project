package Module_2

fun main() {
    val num1 = 25
    val num2 = 6

    println("""
        num1: $num1
        num2: $num2
    """.trimIndent())

    val quotient = num1/num2
    val reminder = num1%num2

    println("""
        Quotient: $quotient
        Reminder: $reminder
    """.trimIndent())
}