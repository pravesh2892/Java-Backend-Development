package corejava.javafundamentals.String.StringOperations;

public class EqualsVersusEquality {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = new String("java");

        System.out.println("equals: " + str1.equals(str2));
        System.out.println("==: " + (str1 == str2));
    }
}
