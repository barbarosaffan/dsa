package aoc

fun getGameId(line: String): Int {
    val lineParts = line.split(":")
    val idPart = lineParts[0].split(" ")[1]

    return idPart.toInt()
}

fun getStats(line: String): MutableList<MutableMap<String, Int>> {
    val result = mutableListOf<MutableMap<String, Int>>()

    val rawParts = line.split(":")
    val parsingPart = rawParts[1]

    val sets = parsingPart.split(";")

    for (set in sets) {
        val gameSet = mutableMapOf<String, Int>()
        val cubes = set.split(",")

        for (cube in cubes) {
            val cubeParts = cube.split(" ")
            val count = cubeParts[1].toInt()
            val color = cubeParts[2]

            gameSet[color] = count
        }
        result.add(gameSet)
    }

    return result
}

fun checkPossibility(stats: MutableList<MutableMap<String, Int>>, stocks: Map<String, Int>): Boolean {
    var possibility = true

    for (stat in stats) {
        val reds = stat.getOrDefault("red", 0)
        val blues = stat.getOrDefault("blue", 0)
        val greens = stat.getOrDefault("green", 0)

        if ((reds > stocks["red"]!!) || (blues > stocks["blue"]!!) || (greens > stocks["green"]!!)) {
            possibility = false
        }
    }

    return possibility
}

fun day2Part1() {
    println("Advent of Code Day 2, Cube Conundrum Part 1")

    val lines = utils.AocInput(2)
    val stocks = mapOf(
        "red" to 12,
        "green" to 13,
        "blue" to 14
    )
    var total = 0

    for (line in lines) {
        val stats = getStats(line)
        val gameId = getGameId(line)
        val isPossible = checkPossibility(stats, stocks)

        if (isPossible) {
            total += gameId
        }
    }

    println("Total: $total")

}

fun main() {
    day2Part1()
}
