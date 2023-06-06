package Module_2

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter your sentence: ")
    val str = sc.nextLine()
    print("Enter your Count Character: ")
    val ch = sc.nextLine()
    var frequency = 0
    for (i in str.indices) {
        if (str[i] == ch[0] || str[i]==ch[0].lowercaseChar() || str[i]==ch[0].uppercaseChar()) {
            ++frequency
        }
    }
    println("Frequency of $ch = $frequency")
}