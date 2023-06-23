package corejava.javafundamentals.Array.ArrayOperations;

public class ArrayAggregate {
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

        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " + sum);

        float average = (float)sum / size;
        System.out.println("Average: " + average);

        int max = arr[0];
        for(int i = 1; i < size; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);

        int min = arr[0];
        for(int i = 1; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
