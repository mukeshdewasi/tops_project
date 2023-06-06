package Assigment_topic_File_Handling

import java.io.File

fun main() {
    val fileName = "rakesh.txt"

    val file = File(fileName)

    val content = file.readText()

    println("File Content:")
    println(content)
}
