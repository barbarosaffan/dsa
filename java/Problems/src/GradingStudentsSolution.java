import java.io.*;
import java.util.*;


class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int nextMultipleOfFive = (grade / 5 + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    roundedGrades.add(nextMultipleOfFive);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }
        return roundedGrades;
    }
}

public class GradingStudentsSolution {
    public static void main(String[] args) throws IOException {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(Result.gradingStudents(grades));
    }
}
