package corejava.javafundamentals.Array.ArrayOperations;

public class MergingArrays {
    public static void main(String[] args) {
        int size1 = 10;
        int arr1[] = new int[size1];
        for(int i = 0; i < size1; i++) {
            arr1[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println("First Array: ");
        for(int i = 0; i < size1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int size2 = 5;
        int arr2[] = new int[size2];
        for(int i = 0; i < size2; i++) {
            arr2[i] = (int)(Math.random() * 100 + 1);
        }

        System.out.println("Second Array: ");
        for(int i = 0; i < size2; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int size = size1 + size2;
        int arr[] = new int[size];
        for(int i = 0; i < size1; i++) {
            arr[i] = arr1[i];
        }
        for(int i = 0; i < size2; i++) {
            arr[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
