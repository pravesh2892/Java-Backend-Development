package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num = 100;
        int first = 0;

        System.out.println(first);
        if(num > 0) {
            int second = 1;
            System.out.println(second);
            int term = first + second;

            while(term <= num) {
                System.out.println(term);
                first = second;
                second = term;
                term = first + second;
            }
        }
    }
}
