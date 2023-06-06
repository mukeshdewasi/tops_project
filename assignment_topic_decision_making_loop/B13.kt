fun main() {
    print("enter the first number")
    var num1= readLine()!!.toInt()
    print("enter the scond value")
    var num2= readLine()!!.toInt()
    var gcd = 1

    var i = 1
    while (i <= num1 && i <= num2) {
        // Checks if i is factor of both integers
        if (num1 % i == 0 && num2 % i == 0)
            gcd = i
        ++i
    }

    println("G.C.D number $gcd")
}