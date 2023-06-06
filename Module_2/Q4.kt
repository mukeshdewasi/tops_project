package Module_2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Multiply Two Floating Number")
    println()
    print("Enter Floating value 1: ")
    var numFloat1 = sc.nextFloat()
    print("Enter Floating value 2: ")
    var numFloat2 = sc.nextFloat()

    var multiFloating = numFloat1 * numFloat2
    println("Multiply Two Floating Number: $multiFloating")

    println()
    println("Find ASCII value of a Character")
    println()
    print("Enter a only one Character: ")
    var ch = sc.next().single()
    var ascii = ch.toInt()
    println("$ch is ASCII value is: $ascii")

}