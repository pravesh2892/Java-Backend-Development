package corejava.javafundamentals.StringBuffer;

public class AppendExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println(s);

        s.append(",").append(" World").append("!");
        System.out.println(s);
    }
}
