package basic

fun main(){
    print("enter the value a")
    var a= readLine()!!.toInt()
    if(a%2==0) {
        println("value is even")
    }else{
        println("value is odd")
    }

}