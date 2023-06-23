package corejava.javafundamentals.Array.ArrayOperations;

public class CopyingArray {
    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println("First Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int copyArray[] = new int[size];
        for(int i = 0; i < size; i++) {
            copyArray[i] = arr[i];
        }

        System.out.println("Copy Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(copyArray[i] + " ");
        }
        System.out.println();
    }
}
