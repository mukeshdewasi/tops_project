package assignment_topic_function

fun Palindrome(s: String): Boolean {
    val cleanString = s.replace("\\W".toRegex(), "").toLowerCase()
    val reversedString = cleanString.reversed()
    return cleanString == reversedString
}

fun main() {
    val string1 = "level"
    val string2 = "Hello"
    val string3 = "A man, a plan, a canal: Panama"

    val Palindrome1 = Palindrome(string1)
    val Palindrome2 = Palindrome(string2)
    val Palindrome3 = Palindrome(string3)

    println("Is '$string1' a palindrome? $Palindrome1")
    println("Is '$string2' a palindrome? $Palindrome2")
    println("Is '$string3' a palindrome? $Palindrome3")
}