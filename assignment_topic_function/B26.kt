package assignment_topic_function

fun printDetails(name: String, age: Int = 0, city: String = "", country: String = "") {
    println("Name: $name")
    if (age != 0) {
        println("Age: $age")
    }
    if (city.isNotEmpty()) {
        println("City: $city")
    }
    if (country.isNotEmpty()) {
        println("Country: $country")
    }
}

fun main() {
    printDetails("John")
    printDetails("Alice", 25)
    printDetails("Bob", 30, "New York")
    printDetails("Eva", 35, "Paris", "France")
}