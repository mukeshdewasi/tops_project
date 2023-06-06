package Module_2

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a Number: ")
    var num = sc.nextInt()
    if (num%2==0){
        println("$num is Even!!")
    }else{
        println("$num is Odd!")
    }
}
