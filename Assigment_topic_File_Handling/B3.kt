package Assigment_topic_File_Handling

import java.io.File



fun main() {
    val fileName = "sohan.txt"
    val content = "This is the content to be written to the file."

    val file = File(fileName)

    file.writeText(content)

    println("Content written to file: $fileName")
}



