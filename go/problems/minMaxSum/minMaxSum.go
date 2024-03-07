package problems

import "fmt"

func minMaxSum(nums []int32) {
	for i := 0; i < len(nums); i++ {
		for j := 0; j < len(nums)-1; j++ {
			if nums[j] > nums[j+1] {
				nums[j], nums[j+1] = nums[j+1], nums[j]
			}
		}
	}

	var minSum, maxSum int64

	for i := 0; i < len(nums)-1; i++ {
		minSum += int64(nums[i])
	}

	for i := 1; i < len(nums); i++ {
		maxSum += int64(nums[i])
	}

	fmt.Println(minSum, maxSum)
}

func MinMaxSumSolution() {
	nums := []int32{1, 2, 3, 4, 5}

	minMaxSum(nums)
}
