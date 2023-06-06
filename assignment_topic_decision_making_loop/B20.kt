fun main() {
    print("enter the numer")
    var num = readLine()!!.toInt()
    var result = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            result = true
            break
        }
    }
    if (!result)
    {
        print("prime number")

    }
    else
    {
        print("not prime number")
    }


}