import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input goes here");

        String text = scanner.nextLine();
        System.out.println("Input Text: " + text);

        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
}