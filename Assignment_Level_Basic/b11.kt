package basic

fun main(){
    var name="m  u k e s h"
    println("name:$name")
    name=name.replace("\\s".toRegex(),"")
    println("name :$name")
}