package basic

fun main(){
    print("enter the value of a")
    var a= readLine()!!.toInt()
    print("enter the value of b")
    var b= readLine()!!.toInt()
    var c =a+b
    println("addition of $a+$b=$c")
}