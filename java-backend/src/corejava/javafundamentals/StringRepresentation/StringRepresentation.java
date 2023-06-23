package corejava.javafundamentals.StringRepresentation;

public class StringRepresentation {
    public static void main(String[] args) {
        int i = 12;

        String s = Integer.toString(i);
        System.out.println(s);

        s = String.valueOf(i);
        System.out.println(s);
    }
}
