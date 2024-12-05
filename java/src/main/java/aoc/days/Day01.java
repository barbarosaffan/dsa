package aoc.days;

import java.util.List;

public class Day01 {
    public int solvePart1(List<String> input) {
        int count = 0;
        for (int i = 1; i < input.size(); i++) {
            int previous = Integer.parseInt(input.get(i - 1));
            int current = Integer.parseInt(input.get(i));
            if (current > previous) {
                count++;
            }
        }
        return count;
    }

    public int solvePart2(List<String> input) {
        int count = 0;
        for (int i = 3; i < input.size(); i++) {
            int window1 = Integer.parseInt(input.get(i - 3)) + Integer.parseInt(input.get(i - 2)) + Integer.parseInt(input.get(i - 1));
            int window2 = Integer.parseInt(input.get(i - 2)) + Integer.parseInt(input.get(i - 1)) + Integer.parseInt(input.get(i));
            if (window2 > window1) {
                count++;
            }
        }
        return count;
    }
}
