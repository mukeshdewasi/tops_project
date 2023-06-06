package assignment_topic_function
fun main() {
    print("enter the number")
    var number= readLine()!!.toInt()
    var flag = false
    for (i in 2..number / 2) {
        if (checkPrime(i)) {
            if (checkPrime(number - i)) {
                System.out.printf("%d = %d + %d\n", number, i, number - i)
                flag = true
            }

        }
    }

    if (!flag)
        println("$number cannot be expressed as the sum of two prime numbers.")
}


fun checkPrime(num: Int): Boolean {
    var isPrime = true

    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    return isPrime
}