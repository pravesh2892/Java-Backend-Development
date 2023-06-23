package corejava.javafundamentals.IterationStatements.Exception;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 4, 5};
        int result = 0;

        try {
            result = arr[0] / arr[5];
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        System.out.println(result);
    }
}
