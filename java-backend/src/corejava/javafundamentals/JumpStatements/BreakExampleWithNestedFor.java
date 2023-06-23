package corejava.javafundamentals.JumpStatements;

public class BreakExampleWithNestedFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
