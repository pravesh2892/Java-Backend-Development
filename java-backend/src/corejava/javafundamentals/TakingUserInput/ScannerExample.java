package corejava.javafundamentals.TakingUserInput;

//Step 1
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        /*
        Syntax:
        class-name object-name = new class-name([parameters]);
         */
        Scanner scanner = new Scanner(System.in); //Step 2

        char c = scanner.next().charAt(0);
        System.out.println("c: " + c);

        byte bInt = scanner.nextByte();
        System.out.println("bInt: " + bInt);

        short sInt = scanner.nextShort();
        System.out.println("sInt: " + sInt);

        int i = scanner.nextInt();
        System.out.println("i: " + i);

        long l = scanner.nextLong();
        System.out.println("l: " + l);

        float f = scanner.nextFloat();
        System.out.println("f: " + f);

        double d = scanner.nextDouble();
        System.out.println("d: " + d);

        boolean b = scanner.nextBoolean();
        System.out.println("b: " + b);

        String s1 = scanner.next();
        scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1 + " " + s2);
    }
}
