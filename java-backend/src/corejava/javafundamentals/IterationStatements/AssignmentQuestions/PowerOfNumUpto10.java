package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class PowerOfNumUpto10 {
    public static void main(String[] args) {
        int num = 2;
        int result = 1;

        for(int i = 1; i <= 10; i++) {
            result = result * num;
            System.out.println(result);
        }
    }
}
