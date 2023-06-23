package corejava.javafundamentals.Array.Extras;

public class OneDArrayUsingForEach {
    public static void main(String[] args) {
        int arr[] = {5, 1, 7, 3, 10};

        int sum = 0;
        for(int num : arr) {
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
