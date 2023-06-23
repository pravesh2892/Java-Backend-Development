package corejava.javafundamentals.String.StringOperations;

public class SplitExample {
    public static void main(String[] args) {
        String s = "foo:and:boo";
        String result[] = s.split(":");
        for(String r : result) {
            System.out.println(r);
        }

        System.out.println();

        String str = "abc and def and ghi";
        String resultStr[] = str.split("and");
        for(String r : resultStr) {
            System.out.println(r);
        }
    }
}
