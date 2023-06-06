package Assignment_Topic_Array

fun main() {
    var num= arrayOf(5,95,2,4,9,555,2,85,52,21)
    println("enter the find number")
    var Find= readLine()!!.toInt()
    var found = false
    for (n in num) {
        if (n == Find) {
            found = true
            break
        }
    }

    if (found)
        println("$Find is found.")
    else
        println("$Find is not found.")
}