package corejava.javafundamentals.String.SearchingInString;

public class IndexOfAndLastIndexOfWithString {
    public static void main(String[] args) {
        String s = "A quick fox and a brown fox";

        System.out.println(s.indexOf("fox"));
        System.out.println(s.lastIndexOf("fox"));

        System.out.println(s.indexOf("fox", 9));
        System.out.println(s.lastIndexOf("fox", 9));

        System.out.println(s.indexOf("bat", 9));
        System.out.println(s.lastIndexOf("bat"));
    }
}
