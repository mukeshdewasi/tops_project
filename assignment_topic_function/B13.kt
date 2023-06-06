package assignment_topic_function
fun main() {
    print("enter the sentence")
    var sentence= readLine()!!.toString()
    var reversed = reverse(sentence)
    println("The reversed sentence is: $reversed")
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty())
        return sentence
    return reverse(sentence.substring(1)) + sentence[0]
}