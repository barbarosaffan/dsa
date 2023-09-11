package main

import "fmt"

func plusMinus(arr []int32) {
	var positiveCount, negativeCount, zeroCount int
	var positiveRatio, negativeRatio, zeroRatio float32

	for i := 0; i < len(arr); i++ {
		if arr[i] > 0 {
			positiveCount++
		} else if arr[i] < 0 {
			negativeCount++
		} else {
			zeroCount++
		}
	}

	positiveRatio = float32(positiveCount) / float32(len(arr))
	negativeRatio = float32(negativeCount) / float32(len(arr))
	zeroRatio = float32(zeroCount) / float32(len(arr))

	fmt.Println(positiveRatio)
	fmt.Println(negativeRatio)
	fmt.Println(zeroRatio)

}

func main() {
	arr := []int32{-4, 3, -9, 0, 4, 1}

	plusMinus(arr)
}
