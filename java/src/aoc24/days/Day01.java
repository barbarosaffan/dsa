package aoc24.days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 {
    public int solvePart1(List<String> input) {
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();
        int total = 0;

        for (String s : input) {
            String[] parts = s.split("\\s+");
            String leftString = parts[0];
            String rightString = parts[1];
            leftSide.add(Integer.parseInt(leftString));
            rightSide.add(Integer.parseInt(rightString));
        }

        Collections.sort(leftSide);
        Collections.sort(rightSide);

        for (int i =0; i< input.size(); i++ ) {
            int leftSideElement = leftSide.get(i);
            int rightSideElement = rightSide.get(i);

            total += Math.abs(leftSideElement - rightSideElement);
        }

        return total;
    }

    public int solvePart2(List<String> input) {
        return 0;
    }
}
