package Assigment_topic_File_Handling

import java.io.File

fun main() {
    val fileName = "lokesh.txt"

    val file = File(fileName)
    val fileExists = file.exists()

    if (fileExists) {
        println("File '$fileName' exists.")
    } else {
        println("File '$fileName' does not exist.")
    }
}