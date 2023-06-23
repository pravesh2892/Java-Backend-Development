package corejava.javafundamentals.String.StringConstructors;

public class StringConstructorExample {
    public static void main(String[] args) {
        //String()
        String s1 = new String();
        System.out.println("s1: " + s1);

        //String(char chars[])
        char chars[] = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'a', ' ', 'l', 'a', 'n', 'g', 'u', 'a', 'g', 'e'};
        String s2 = new String(chars);
        System.out.println("s2: " + s2);

        //String(char chars[], int startIndex, int numChars)
        String s3 = new String(chars, 5, 6);
        System.out.println("s3: " + s3);

        //String(String strObj)
        String s4 = new String(s2);
        System.out.println("s4: " + s4);

        //String(byte chars[])
        byte charByte[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
        String s5 = new String(charByte);
        System.out.println("s5: " + s5);

        //String(byte chars[], int startIndex, int numChars)
        String s6 = new String(charByte, 2, 6);
        System.out.println("s6: " + s6);
    }
}
