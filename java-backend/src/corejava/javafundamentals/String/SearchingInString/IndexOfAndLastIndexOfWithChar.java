package corejava.javafundamentals.String.SearchingInString;

public class IndexOfAndLastIndexOfWithChar {
    public static void main(String[] args) {
        String s = "A quick brown fox";
        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('o'));

        System.out.println(s.indexOf('z'));
        System.out.println(s.lastIndexOf('z'));

        System.out.println(s.indexOf('o', 11));
        System.out.println(s.lastIndexOf('o', 11));

        System.out.println(s.indexOf('z', 11));
        System.out.println(s.lastIndexOf('z', 11));
    }
}
