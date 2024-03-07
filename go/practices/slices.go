package practices

import "fmt"

func Slices() {
	var sl []int64

	sl = append(sl, 10)
	sl = append(sl, 20)
	sl = append(sl, 30)

	slWValues := []int64{40, 50, 60}

	fmt.Println("Slice with appended elements: ", sl)
	fmt.Println("Slice with values: ", slWValues)

	var twoDSlice [][]int64

	twoDSlice = append(twoDSlice, []int64{1, 2, 3})
	twoDSlice = append(twoDSlice, []int64{4, 5, 6})
	twoDSlice = append(twoDSlice, []int64{7, 8, 9})

	fmt.Println("Two dimensional slice: ", twoDSlice)
	fmt.Println("Middle Element in 2D Slice: ", twoDSlice[1][1])
	fmt.Println("Length of 2D Slice: ", len(twoDSlice))

	slWMake := make([]int64, 5, 10)

	fmt.Println("Slice with make: ", slWMake)

	clear(slWValues)
	fmt.Println("Clean Slice: ", slWValues)
	fmt.Println("Len of Clean Slice: ", len(slWValues))

	letters := []string{"b", "a", "r", "b", "a", "r", "o", "s"}

	fmt.Println("Letters: ", letters)

	barb := letters[0:4]

	fmt.Println("Barb: ", barb)
}
