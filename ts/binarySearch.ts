console.log("Binary Search");

const haystack = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14];
console.log("Haystack: ", haystack);

const needle = 9;
console.log("Needle: ", needle);

console.log("Searching...")

function binarySearch(haystack: number[], needle: number) {
  let lowestPoint = 0;
  let highestPoint = haystack.length;

  do {
    const midPoint = Math.floor(lowestPoint + (highestPoint - lowestPoint) / 2);
    const value = haystack[midPoint];

    if (value === needle) {
      return true
    } else if (value > needle) {
      highestPoint = midPoint
    } else if (value < needle) {
      lowestPoint = midPoint + 1;
    }
  } while (
    lowestPoint < highestPoint
  )

  return false;
}

console.log("Does it exist: ", binarySearch(haystack, needle));
