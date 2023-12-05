package aoc

fun day1Part1() {
    println("Advent of Code Day 1, Trebuchet Part 1")

    val lines = utils.AocInput(1)

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

    println("Total 1: $total")
}

fun day1Part2() {
    println("Advent of Code Day 1, Trebuchet Part 2")

    val digitTexts = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

    val lines = utils.AocInput(1)
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
        total += if (secondDigit > -1) {
            firstDigit * 10 + secondDigit
        } else {
            firstDigit * 10 + firstDigit
        }
    }


    println("Total 2: $total")

}

fun main() {
    day1Part1()
    day1Part2()
}
