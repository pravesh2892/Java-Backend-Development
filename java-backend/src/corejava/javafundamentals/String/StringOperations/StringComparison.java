package corejava.javafundamentals.String.StringOperations;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "JavaScript";
        String str4 = "java";

        boolean result14 = str1.equals(str4);
        System.out.println("result14: " + result14);

        boolean result12 = str1.equalsIgnoreCase(str2);
        System.out.println("result12: " + result12);

        boolean result32 = str3.startsWith(str2);
        System.out.println("result32: " + result32);

        boolean result31 = str3.startsWith(str1);
        System.out.println("result31: " + result31);

        String str5 = "script";
        String str6 = "Script";

        boolean result35 = str3.endsWith(str5);
        System.out.println("result35: " + result35);

        boolean result36 = str3.endsWith(str6);
        System.out.println("result36: " + result36);
    }
}
