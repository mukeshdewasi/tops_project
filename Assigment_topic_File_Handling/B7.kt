package Assigment_topic_File_Handling

import java.io.File

fun main() {
    val directoryPath = "path/to/directory"

    val directory = File(directoryPath)
    if (directory.exists() && directory.isDirectory) {
        iterateFiles(directory)
    } else {
        println("Directory '$directoryPath' does not exist or is not a directory.")
    }
}

fun iterateFiles(directory: File) {
    val files = directory.listFiles()
    if (files != null) {
        for (file in files) {
            if (file.isDirectory) {
                iterateFiles(file)  // Recursive call for subdirectories
            } else {
                println(file.absolutePath)
            }
        }
    }
}