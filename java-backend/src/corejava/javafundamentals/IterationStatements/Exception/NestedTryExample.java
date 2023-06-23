package corejava.javafundamentals.IterationStatements.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryExample {
    public static void main(String[] args) {
        //ArithmeticException

        //ArrayIndexOutOfBoundException

        //InputMismatchException
        Scanner scanner = new Scanner(System.in);

        int num1 = 10, num2 = 5, result = 0;
        try {
            result = num1 / num2;

            int arr[] = {1, 2, 3};

            try {
                arr[5] = result;

                try {
                    arr[0] = scanner.nextInt();
                }
                catch(InputMismatchException e) {
                    e.printStackTrace();
                }
            }
            catch(ArithmeticException e) {
                e.printStackTrace();
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("End of main() method");
    }
}
