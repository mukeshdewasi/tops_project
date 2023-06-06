package basic

fun main(){
    print("enter the value a")
    var a= readLine()!!.toInt()
    print("enter the value b")
    var b= readLine()!!.toInt()
    var quotient=a%b
    var reminder=a/b
    println("quotient is $a/$b=$quotient")
    println("reminder is $a%$b=$reminder")

}