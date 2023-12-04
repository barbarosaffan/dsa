package aoc

fun getInputs(): MutableList<String> {
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

    return lines
}

fun partOne() {
    println("Advent of Code Day 1, Trebuchet Part 1")

    val lines = getInputs()

    var total = 0

    for (line in lines) {
        val chars = line.toCharArray()
        var firstNum = -1
        var secondNum = -1

        for (char in chars) {
            if (char.isDigit()) {
                if (firstNum == -1) {
                    firstNum = char.toString().toInt()
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

    println("Totali 1: $total")
}

fun partTwo() {
    println("Advent of Code Day 1, Trebuchet Part 2")

    val textNumbers = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    val lines = getInputs()
    var total = 0

    for (line in lines) {
        var digitString = ""
        var firstNum = -1
        var secondNum = -1

        val chars = line.toCharArray()

        for (char in chars) {
            if (char.isDigit()) {
                if (firstNum != -1) {
                    firstNum = char.toString().toInt()
                } else {
                    secondNum = char.toString().toInt()
                }

                digitString = ""
            } else {
                digitString += char

                if (textNumbers.containsKey(digitString)) {
                    val number = textNumbers[digitString]!!
                    if (firstNum == -1) {
                        firstNum = number
                    } else if (secondNum == -1) {
                        secondNum = number
                    }
                    digitString = ""
                }
            }
        }

        if (secondNum == -1) {
            total += firstNum * 10 + firstNum
        }
        total += firstNum * 10 + secondNum
    }

    println("Total 2: $total")

}

fun main() {
    partOne()
    partTwo()
}
