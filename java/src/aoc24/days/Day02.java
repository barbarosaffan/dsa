package aoc24.days;

import java.util.List;

public class Day02 {
    public int solvePart1(List<String> input) {
        int totalSafe = 0;

        for (String s : input) {
            List<String> row = List.of(s.split("\\s+"));
            boolean allSafe = true;
            boolean isIncreasing = true;
            boolean isDecreasing = true;

            for (int j = 1; j < row.size(); j++) {
                int previous = Integer.parseInt(row.get(j - 1));
                int current = Integer.parseInt(row.get(j));

                if (current > previous) {
                    isDecreasing = false;
                } else if (current < previous) {
                    isIncreasing = false;
                }

                if (Math.abs(current - previous) < 1 || Math.abs(current - previous) > 3) {
                    allSafe = false;
                    break;
                }
            }

            if (allSafe && (isIncreasing || isDecreasing)) {
                totalSafe++;
            }

        }

        return totalSafe;
    }

    public int solvePart2(List<String> input) {
        return 0;
    }
}
