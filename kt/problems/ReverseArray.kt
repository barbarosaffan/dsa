package problems

fun reverseArray(arr: Array<Int>): Array<Int> {
    val reversedArr = Array(arr.size) { 0 }
    var j = 0
    for (i in arr.size - 1 downTo 0) {
        reversedArr[j] = arr[i]
        j++
    }
    return reversedArr
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val reversedArr = reverseArray(arr)
    println(reversedArr.contentToString())
}
