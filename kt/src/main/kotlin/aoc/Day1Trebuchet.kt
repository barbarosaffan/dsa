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

    val digitTexts = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

    val lines = getInputs()
    var total = 0

    for (line in lines) {
        val chars = line.toCharArray()
        var digitString = ""
        var firstDigit = -1
        var secondDigit = -1
        for (char in chars) {
            digitString += char

            if (char.isDigit()) {
                if (firstDigit > -1) {
                    secondDigit = char.toString().toInt()
                } else {
                    firstDigit = char.toString().toInt()
                }
            } else {
                for (digitText in digitTexts) {
                    if (digitString.contains(digitText)) {
                        val digit = digitTexts.indexOf(digitText)
                        digitString = ""
                        if (firstDigit > -1) {
                            secondDigit = digit
                        } else {
                            firstDigit = digit
                        }
                        break
                    }
                }
            }
        }
        if (secondDigit > -1) {
            total += firstDigit * 10 + secondDigit
        } else {
            total += firstDigit * 10 + firstDigit
        }
    }


    println("Total 2: $total")

}

fun main() {
    partOne()
    partTwo()
}
