package problems

fun maxProductDifference(nums: IntArray) : Int {
    nums.sort()

    return nums[nums.size - 1] * nums[nums.size - 2] - nums[0] * nums[1]
}

fun main () {
    println("Max Product Difference")
    val nums = intArrayOf(4,2,5,9,7,4,8)

    println(maxProductDifference(nums))
}
