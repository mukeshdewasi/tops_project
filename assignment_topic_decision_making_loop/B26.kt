fun main() {
    print(" enter the sentance=")
    var line= readLine()!!.toString()
    var vowels = 0
    var consonants = 0
    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels
        } else if (ch in 'a'..'z') {
            ++consonants
        }
    }

   println("vowel $vowels")
    println("consonant$consonants")
}