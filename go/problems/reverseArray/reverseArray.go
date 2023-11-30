package main

import "fmt"

func reverseArray(arr []int32) []int32 {
	var i int32
	var j int32 = int32(len(arr) - 1)

	for i < j {
		arr[i], arr[j] = arr[j], arr[i]
		i++
		j--
	}

	return arr
}

func main() {
	arr := []int32{1, 2, 3, 4, 5}

	fmt.Println(reverseArray(arr))
}
