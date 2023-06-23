package corejava.javafundamentals.StringBuffer;

public class InsertExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Java is a language");

        s.insert(9, " programming");

        System.out.println(s);
    }
}
