console.log("Linear Search")

let haystack = [1, 2, 3, 4, 5, 6, 7, 8];
console.log("Haystack: ", haystack);

let needle = 4;
console.log("Needle: ", needle);

console.log("Searching...")

function linearSearch(haystack: number[], needle: number): boolean {
  for (let i = 0; i < haystack.length; ++i) {
    if (haystack[i] === needle) {
      return true;
    }
  }
  return false;
}


console.log("Does it exist: ", linearSearch(haystack, needle));
