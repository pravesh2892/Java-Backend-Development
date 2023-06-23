package corejava.javafundamentals.String.StringOperations;

public class StringComparisonCompareTo {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ghijklt";
        String str3 = "abcrg";
        String str4 = "ghijklmno";

        int result13 = str1.compareTo(str3);
        System.out.println("result13: " + result13);

        int result12 = str1.compareTo(str2);
        System.out.println("result12: " + result12);

        int result24 = str2.compareTo(str4);
        System.out.println("result24: " + result24);
    }
}
