package corejava.javafundamentals.Array.ArrayOperations;

public class UpdatingArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int size = arr.length;

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }

        arr[3] = 8;
        arr[7] = 8;

        System.out.println("Initial Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int initialValue = 8;
        int finalValue = 18;

        for(int i = 0; i < size; i++) {
            if(arr[i] == initialValue) {
                arr[i] = finalValue;
                break;
            }
        }

        System.out.println("Final Array: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
