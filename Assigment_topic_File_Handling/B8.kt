package Assigment_topic_File_Handling

import java.io.File

fun main() {
    val directoryPath = "path/to/direcctory"

    val directory = File(directoryPath)
    if (!directory.exists() || !directory.isDirectory) {
        println("Directory '$directoryPath' does not exist or is not a directory.")
        return
    }

    deleteFiles(directory)
    println("All files have been deleted from the directory.")
}

fun deleteFiles(directory: File) {
    val files = directory.listFiles()
    if (files != null) {
        for (file in files) {
            if (file.isDirectory) {
                deleteFiles(file)
            } else {
                file.delete()
            }
        }
    }
}