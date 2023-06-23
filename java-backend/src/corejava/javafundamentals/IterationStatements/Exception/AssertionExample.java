package corejava.javafundamentals.IterationStatements.Exception;

import java.util.Scanner;

public class AssertionExample {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        age = scanner.nextInt();

        assert age > 0 : "'age' should be a positive number";

        System.out.println(age);
    }
}
