package corejava.javafundamentals.TakingUserInput;

//Step 1
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(i);
    }
}
