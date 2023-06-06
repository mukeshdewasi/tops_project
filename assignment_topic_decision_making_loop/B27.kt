fun main() {

    var string = arrayOf("dixit", "bitu", "mukesh", "yuvraj")
    for (i in 0..2) {
        for (j in i + 1..3) {
            if (string[i].compareTo(string[j]) > 0) {
                var result = string[i]
                string[i] = string[j]
                string[j] = result
            }
        }
    }
    println("In lexicographical order:")
    for (i in 0..3)
    {
        println(string[i])
    }
}