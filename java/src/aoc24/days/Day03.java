package aoc24.days;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day03 {
    public int solvePart1(List<String> input) {
        int result = 0;
        String regex = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
        Pattern pattern = Pattern.compile(regex);

        for (String s : input) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {

                int num1 = Integer.parseInt(matcher.group(1));
                int num2 = Integer.parseInt(matcher.group(2));
                result += num1 * num2;
            }
        }

        return result;
    }

    public int solvePart2(List<String> input) {
        return 0;
    }
}
