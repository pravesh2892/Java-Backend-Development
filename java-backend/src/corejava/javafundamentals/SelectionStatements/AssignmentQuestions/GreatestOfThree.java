package corejava.javafundamentals.SelectionStatements.AssignmentQuestions;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result;

        if(num1 >= num2 && num1 >= num3) {
            result = num1;
        }
        else if(num2 >= num1 && num2 >= num3) {
            result = num2;
        }
        else {
            result = num3;
        }

        System.out.println("Result: " + result);
    }
}
