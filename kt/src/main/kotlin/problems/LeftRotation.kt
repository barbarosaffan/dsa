package problems

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    repeat(d) {
        val temp = arr[0]
        var i = 0

        while (i < arr.size - 1) {
            arr[i] = arr[i + 1]
            i++
        }

        arr[arr.size - 1] = temp
    }

    println(arr.joinToString(", "))

    return arr
}

fun main() {
    println("HackerRank DS, Left Rotation Problem")
    
    val d = 2
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    rotateLeft(d, arr)
}
