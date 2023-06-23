package corejava.javafundamentals.StringBuffer;

public class SetCharAtExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Helli");
        System.out.println(s);

        s.setCharAt(4, 'o');
        System.out.println(s);
    }
}
