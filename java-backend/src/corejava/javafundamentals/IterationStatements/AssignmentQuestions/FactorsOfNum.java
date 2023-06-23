package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class FactorsOfNum {
    public static void main(String[] args) {
        int num = 29;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
