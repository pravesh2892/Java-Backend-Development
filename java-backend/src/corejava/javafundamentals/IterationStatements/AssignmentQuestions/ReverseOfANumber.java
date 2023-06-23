package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int num = 1578;
        int reverse = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        System.out.println(reverse);
    }
}
