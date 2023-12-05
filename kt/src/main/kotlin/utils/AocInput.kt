package utils

fun AocInput(day: Int): MutableList<String> {
    val resourceName = "aoc/Day$day.txt"
    val inputStream = Thread.currentThread().contextClassLoader.getResourceAsStream(resourceName)
    val lines = mutableListOf<String>()

    if (inputStream != null) {
        inputStream.bufferedReader().useLines {
            lines.addAll(it.toList())
        }
    } else {
        println("File not found in resources.")
    }

    return lines
}
