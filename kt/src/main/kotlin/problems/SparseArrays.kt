package problems

fun matchingStrings(
    stringList: Array<String>,
    queries: Array<String>
)
        : Array<Int> {
    val results = Array(queries.size) { 0 }

    for ((index, value) in queries.withIndex()) {
        var occurrence = 0
        stringList.forEach {
            if (
                it == value
            ) {
                occurrence++
            }
        }
        results[index] = occurrence
    }

    return results
}

fun main() {
    val stringList = arrayOf("ab", "ab", "abc")
    val queries = arrayOf("ab", "abc", "bc")

    val results = matchingStrings(stringList, queries)

    for (value in results) {
        println("Value: $value")
    }

}
