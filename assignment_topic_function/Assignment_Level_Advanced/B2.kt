package assignment_topic_function.Assignment_Level_Advanced

fun main() {
    val month = "JUN"
    val pattern = getPattern(month)
    val date = "13 JUN 1992"

    val match = Regex(pattern).matches(date)

    println("Pattern: $pattern")
    println("Date: $date")
    println("Match: $match")
}

fun getPattern(month: String) = """\d{2} $month \d{4}"""