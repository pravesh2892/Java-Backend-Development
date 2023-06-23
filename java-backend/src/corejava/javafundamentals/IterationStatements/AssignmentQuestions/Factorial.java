package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class Factorial {
    public static void main(String[] args) {
        int num = 9;

        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
