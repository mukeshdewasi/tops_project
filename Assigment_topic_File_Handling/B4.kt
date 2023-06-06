package Assigment_topic_File_Handling

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

fun main() {
    val fileName = "dixit.txt"
    val content = "This is the content to be appended to the file."

    try {
        BufferedWriter(FileWriter(fileName, true)).use { writer ->
            writer.append(content)
            writer.newLine()
        }
        println("Content appended to file: $fileName")
    } catch (e: IOException) {
        println("An error occurred while appending to the file.")
        e.printStackTrace()
    }
}