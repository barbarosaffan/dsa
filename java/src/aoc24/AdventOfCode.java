package aoc24;

import aoc24.days.Day03;
import aoc24.utils.FileReaderUtil;

public class AdventOfCode {
    public static void main(String[] args) {
        Day03 day03 = new Day03();
        var input = FileReaderUtil.readLines("src/resources/inputs/day03.txt");

        System.out.println("Day 2 - Part 1: " + day03.solvePart1(input));
        System.out.println("Day 2 - Part 2: " + day03.solvePart2(input));
    }
}
