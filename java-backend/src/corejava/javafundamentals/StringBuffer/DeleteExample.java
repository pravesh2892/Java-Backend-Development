package corejava.javafundamentals.StringBuffer;

public class DeleteExample {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("welcomewel");
        s.delete(7, 9);
        System.out.println(s);

        s.deleteCharAt(20);
        System.out.println(s);
    }
}
