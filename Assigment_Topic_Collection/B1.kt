package Assigment_Topic_Collection

fun main() {
    val city = hashMapOf<String, String>()
    city["india"] = "dehli"
    city["New York"] = "New York City"
    city["Texas"] = "Houston"
    city["Florida"] = "Miami"

    for ((state, city) in city) {
        println("State: $state, City: $city")
    }
}