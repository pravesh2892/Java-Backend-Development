package corejava.javafundamentals.String.StringOperations;

public class FormatExample {
    public static void main(String[] args) {
        String s;

        s = String.format("%d", 123);
        System.out.println(s);

        s = String.format("%x", 123);
        System.out.println(s);

        s = String.format("|%10d|", 153);
        System.out.println(s);

        s = String.format("|%-10d|", 153);
        System.out.println(s);

        s = String.format("|%010d|", 153);
        System.out.println(s);
    }
}
