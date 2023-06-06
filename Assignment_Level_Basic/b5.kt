package basic

fun main(){
    print("enter the value of a")
    var a= readLine()!!.toFloat()
    print("enter the value of b")
    var b= readLine()!!.toFloat()
    var c=a*b
    println("multiply of $a*$b=$c")
}