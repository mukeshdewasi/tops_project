package Module_2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter Num1: ")
    var num1 = sc.nextInt()
    print("Enter Num2: ")
    var num2 = sc.nextInt()

    var total = num1 + num2
    println("Add Two Number is: $total")
}