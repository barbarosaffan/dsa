package aoc24;

import aoc24.days.Day01;
import aoc24.utils.FileReaderUtil;

public class AdventOfCode {
    public static void main(String[] args) {
        Day01 day01 = new Day01();
        var input = FileReaderUtil.readLines("src/resources/inputs/day01.txt");

        System.out.println("Day 1 - Part 1: " + day01.solvePart1(input));
        System.out.println("Day 1 - Part 2: " + day01.solvePart2(input));
    }
}
