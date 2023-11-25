console.log("Bubble Sort")

const array = [1, 31, 2, 5, 33, 3139, 5, 99999, 3];

function bubbleSort(arr: number[]) {
  for (let i = 0; i < arr.length; ++i) {
    for (let j = 0; j < arr.length - 1 - i; ++j) {
      if (arr[j] > arr[j + 1]) {
        const temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }

  return arr;
}

console.log("Unsorted: ", array);

bubbleSort(array);

console.log("Sorted: ", array);
