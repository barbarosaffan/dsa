package problems

fun containsDuplicate(nums: IntArray): Boolean {
    val seenNumbers = HashSet<Int>()

    for (num in nums) {
        if (seenNumbers.contains(num)) {
            return true
        }
        seenNumbers.add(num)
    }

    return false
}

fun main() {
    println("Contains Duplicate")

    val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)

    println(containsDuplicate(nums))
}
