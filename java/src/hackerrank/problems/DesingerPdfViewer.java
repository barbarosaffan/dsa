package hackerrank.problems;

import java.util.HashMap;
import java.util.List;

public class DesingerPdfViewer {
    private final List<Integer> heights = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
    private final HashMap<Character, Integer> letterIndexMap = new HashMap<Character, Integer>();
    private int maxHeight = 0;

    public int solve(String word) {
        this.letterIndexMap.put('a', 0);
        this.letterIndexMap.put('b', 1);
        this.letterIndexMap.put('c', 2);
        this.letterIndexMap.put('d', 3);
        this.letterIndexMap.put('e', 4);
        this.letterIndexMap.put('f', 5);
        this.letterIndexMap.put('g', 6);
        this.letterIndexMap.put('h', 7);
        this.letterIndexMap.put('i', 8);
        this.letterIndexMap.put('j', 9);
        this.letterIndexMap.put('k', 10);
        this.letterIndexMap.put('l', 11);
        this.letterIndexMap.put('m', 12);
        this.letterIndexMap.put('n', 13);
        this.letterIndexMap.put('o', 14);
        this.letterIndexMap.put('p', 15);
        this.letterIndexMap.put('q', 16);
        this.letterIndexMap.put('r', 17);
        this.letterIndexMap.put('s', 18);
        this.letterIndexMap.put('t', 19);
        this.letterIndexMap.put('u', 20);
        this.letterIndexMap.put('v', 21);
        this.letterIndexMap.put('w', 22);
        this.letterIndexMap.put('x', 23);
        this.letterIndexMap.put('y', 24);
        this.letterIndexMap.put('z', 25);

        for (int i = 0; i < word.length(); i++) {
            int index = this.letterIndexMap.get(word.charAt(i));
            int height = heights.get(index);
            if (height > this.maxHeight) {
                this.maxHeight = height;
            }
        }

        return this.maxHeight * word.length();
    }
}
