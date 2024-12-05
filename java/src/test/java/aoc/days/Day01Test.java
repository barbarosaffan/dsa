package aoc.days;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {
    @Test
    void testSolvePart1() {
        Day01 day01 = new Day01();
        List<String> testInput = List.of("199", "200", "208", "210", "200", "207", "240", "269", "260", "263");
        assertEquals(7, day01.solvePart1(testInput));
    }

    @Test
    void testSolvePart2() {
        Day01 day01 = new Day01();
        List<String> testInput = List.of("199", "200", "208", "210", "200", "207", "240", "269", "260", "263");
        assertEquals(5, day01.solvePart2(testInput));
    }
}
