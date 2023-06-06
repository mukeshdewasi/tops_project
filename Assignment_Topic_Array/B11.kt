import java.util.Arrays
fun main(args: Array<String>) {
    var array1 = intArrayOf(1, 2, 3)
    var array2 = intArrayOf(4, 5, 6)

    var num1 = array1.size
    var num2 = array2.size
    var result = IntArray(num1 + num2)

    System.arraycopy(array1, 0, result, 0, num1)
    System.arraycopy(array2, 0, result, num1, num2)

    println(Arrays.toString(result))
}


