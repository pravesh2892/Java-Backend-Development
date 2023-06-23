package corejava.javafundamentals.String.StringOperations;

public class SplitLimitExample {
    public static void main(String[] args) {
        String str = "boo:and:foo";
        String regex = ":";
        int limit = 3;

        String result[] = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = 2;
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = 5;
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = -5;
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = 0;
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = 0;
        regex = "o";
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");

        limit = -1;
        regex = "o";
        result = str.split(regex, limit);
        for(String r : result) {
            System.out.println(r);
        }
        System.out.println("----");
    }
}
