package main

import "fmt"

func hourglassSum(arr [][]int32) int32 {
	maxSum := int32(-63)

	for i := 0; i <= 3; i++ {
		for j := 0; j <= 3; j++ {
			sum := arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

			if sum > maxSum {
				maxSum = sum
			}
		}
	}
	return maxSum
}

func main() {
	arr := [][]int32{
		{-9, -9, -9, 1, 1, 1},
		{0, -0, 0, 4, 3, 2},
		{-9, -9, -9, 1, 2, 3},
		{-9, -9, -9, 1, 2, 3},
		{0, 0, 0, -2, 0, 0},
		{0, 0, 1, 2, 4, 0},
	}

	maximumSum := hourglassSum(arr)

	fmt.Println(maximumSum)
}
