package corejava.javafundamentals.WrapperClass;

public class WrapperExample {
    public static void main(String[] args) {
        int i = 12;
        float f = 3.14f;

        Integer iObj = 10;
        Double dObj = 6.8;

        Double result = i + f / iObj * dObj;

        System.out.println(result);
    }
}
