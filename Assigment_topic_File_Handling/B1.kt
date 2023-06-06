package Assigment_topic_File_Handling
import java.io.File

fun main() {
    val fileName = "rahul.txt"
    val content = "This is the content of the file."

    val file = File(fileName)
    file.createNewFile()

    file.writeText(content)

    println("File created: $fileName")
}


