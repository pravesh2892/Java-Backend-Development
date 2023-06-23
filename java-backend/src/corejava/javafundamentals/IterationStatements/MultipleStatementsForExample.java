package corejava.javafundamentals.IterationStatements;

public class MultipleStatementsForExample {
    public static void main(String[] args) {
        int i = 1, j = 1;
        boolean c = (i <= 10 && j <= 10);
        for(; c; i++, j++) {
            if(i > 10 || j > 10) {
                c = false;
            }
            if(c) {
                System.out.println(i + " " + j);
            }
        }
    }
}
