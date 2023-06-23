package corejava.javafundamentals.SelectionStatements.AssignmentQuestions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        int remainder = num % 2;

        if(remainder == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
