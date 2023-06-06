package assignment_topic_decision_making_loop

import kotlin.math.sqrt

fun findRoot(a:Double,b:Double,c:Double):Pair<Double?,Double?>{
    var discriminant = b * c - 4 * a * c
    if (discriminant>=0){
        val root1 =(-b + sqrt(discriminant))/(2 * a)
        var root2 =(-b - sqrt(discriminant))/(2 * a)
        return Pair(root1,root2)
    }
    return Pair(null,null)
}
fun main() {
    println("Enter the coefficients quadratic equation")
    val (a,b,c)= readLine()?.split(" ")?.map { it.toDoubleOrNull() }?: listOf(null,null,null)

    if (a!=null && b !=null && c !=null){
        val (root1,root2) = findRoot(a,b,c)
        if (root1 != null && root2!=null){
            println("Roots are real and different")
            println("Root 1 $root1")
            println("Root 2 $root2")

        }else if (root1!=null){
            println("Roots are real and same")
            println("Root $root1")
        }else{
            println("Root are complex")
        }
    }else{
        println("Please enter valid coefficients")
    }
}