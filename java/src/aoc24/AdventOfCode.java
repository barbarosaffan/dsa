package aoc24;

import aoc24.days.Day02;
import aoc24.utils.FileReaderUtil;

public class AdventOfCode {
    public static void main(String[] args) {
        Day02 day02 = new Day02();
        var input = FileReaderUtil.readLines("src/resources/inputs/day02.txt");

        System.out.println("Day 2 - Part 1: " + day02.solvePart1(input));
        System.out.println("Day 2 - Part 2: " + day02.solvePart2(input));
    }
}
