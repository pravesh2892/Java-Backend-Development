package corejava.javafundamentals.Array.Extras;

public class VarExample {
    public static void main(String[] args) {
        var num = 10;
        System.out.println(num + 10);

        var arr = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
