package Assigment_topic_File_Handling

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.io.IOException

fun main() {
    val sourceFile = "source.txt"
    val destinationFile = "destination.txt"

    try {
        Files.copy(Paths.get(sourceFile), Paths.get(destinationFile), StandardCopyOption.REPLACE_EXISTING)
        println("File copied successfully from '$sourceFile' to '$destinationFile'.")
    } catch (e: IOException) {
        println("An error occurred while copying the file.")
        e.printStackTrace()
    }
}