package aoc

fun main() {
    println("Advent of Code Day 1: Trebuchet")

    val resourceName = "aoc/Day1.txt"
    val inputStream = Thread.currentThread().contextClassLoader.getResourceAsStream(resourceName)
    val lines = mutableListOf<String>()

    if (inputStream != null) {
        inputStream.bufferedReader().useLines {
            lines.addAll(it.toList())
        }
    } else {
        println("File not found in resources.")
    }

    var total = 0

    for (line in lines) {
        val chars = line.toCharArray()
        var foundFirstDigit = false
        var firstNum = -1
        var secondNum = -1

        for (char in chars) {
            if (char.isDigit()) {
                if (!foundFirstDigit) {
                    firstNum = char.toString().toInt()
                    foundFirstDigit = true
                } else {
                    secondNum = char.toString().toInt()
                }
            }
        }

        if (firstNum == -1) return

        total += if (secondNum == -1) {
            "$firstNum$firstNum".toInt()
        } else {
            "$firstNum$secondNum".toInt()
        }

    }

    println("Total: $total")
}
