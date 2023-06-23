package corejava.javafundamentals.IterationStatements.Exception;

public class ArrayIndexOutOfBoundException {
    private static void printArrayElement(int arr[], int index) {
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        printArrayElement(arr, 10);
    }
}
