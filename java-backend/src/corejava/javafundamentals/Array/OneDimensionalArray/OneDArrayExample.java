package corejava.javafundamentals.Array.OneDimensionalArray;

public class OneDArrayExample {
    public static void main(String[] args) {
        //Step 1
        int arr[] = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = i * 2;
        }

        System.out.println(arr[15]);
    }
}
