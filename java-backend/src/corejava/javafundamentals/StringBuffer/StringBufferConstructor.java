package corejava.javafundamentals.StringBuffer;

public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        System.out.println("-----");

        StringBuffer s2 = new StringBuffer(10);
        System.out.println(s2.length());
        System.out.println(s2.capacity());
        System.out.println("-----");

        String s = "Java";
        StringBuffer s3 = new StringBuffer(s);
        System.out.println(s3.length());
        System.out.println(s3.capacity());
        System.out.println("-----");

        CharSequence c = new StringBuilder();
        StringBuffer s4 = new StringBuffer(c);
        System.out.println(s4.length());
        System.out.println(s4.capacity());
        System.out.println("-----");
    }
}
