package corejava.javafundamentals.Array.Extras;

public class TwoDArrayUsingForEach {
    public static void main(String[] args) {
        int [][]arr = {
                {4, 10, 6, 3},
                {36, 71, 90, 88},
                {1, 2, 3, 4}
        };

        for(int []eachArr : arr) {
            for(int num : eachArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
