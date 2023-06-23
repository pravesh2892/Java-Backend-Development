package corejava.javafundamentals.IterationStatements.PatternQuestions;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 7;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * (n - i) - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
