package corejava.javafundamentals.String.StringOperations;

public class StringConversion {
    public static void main(String[] args) {
        int i = 123;
        float f = 3.14f;
        double d = 1.9876;

        String result = String.valueOf(i) + String.valueOf(d) + String.valueOf(f);

        System.out.println(result);
    }
}
