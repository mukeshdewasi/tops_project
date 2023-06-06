package Module_2

fun main() {
    val arr = arrayListOf(12, 32, 5, 40)
   findMax(arr)
}

fun findMax(arr: ArrayList<Int>){
    var max = arr[0]
    for (i in 0 until arr.size){
        if (arr[i] > max)
            max = arr[i]
    }
    println("Maximum Number is: $max")
}
