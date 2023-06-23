package corejava.javafundamentals.String.StringOperations;

public class CharacterExtraction {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        char ch = str.charAt(4);
        System.out.println("ch: " + ch);

        int sourceStart = 2;
        int sourceEnd = 14;
        int targetStart = 5;
        int targetSize = targetStart + (sourceEnd - sourceStart);
        char target[] = new char[targetSize];

        str.getChars(sourceStart, sourceEnd, target, targetStart);

        String result = new String(target);

        System.out.println("result: " + result);

        char strChar[] = str.toCharArray();
        System.out.println("Char array: ");
        for(char c : strChar) {
            System.out.print(c + " ");
        }
    }
}
