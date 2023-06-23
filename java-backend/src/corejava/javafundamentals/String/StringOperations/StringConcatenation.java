package corejava.javafundamentals.String.StringOperations;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "snow";
        String s2 = "ball";
        String s3 = "white";

        //concat()
        String s1s2 = s1.concat(s2);
        System.out.println("s1s2: " + s1s2);

        String s2s1 = s2.concat(s1);
        System.out.println("s2s1: " + s2s1);

        String s3s1s2 = s3.concat(s1).concat(s2);
        System.out.println("s3s1s2: " + s3s1s2);

        //+
        String s4 = "white" + "snow" + "ball";
        System.out.println("s4: " + s4);

        String s5 = "java" + 2;
        System.out.println("s5: " + s5);

        String s6 = "java" + 2 + 2;
        System.out.println("s6: " + s6);

        String s7 = "java" + (2 + 2);
        System.out.println("s7: " + s7);

        int num = 10;
        System.out.println("num: " + num);

        //join()
        String s8 = String.join(" is ", s1, s2, s3);
        System.out.println("s8: " + s8);
    }
}
