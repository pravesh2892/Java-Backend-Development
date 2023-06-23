package corejava.javafundamentals.OOP.Fundamentals;

public class RecursionExample {
    void demo(int num) {
        System.out.println("Calling demo() from demo() with value: " + num);
        if(num > 0) {
            demo(num - 1);
        }
        System.out.println("demo() from demo() completed with value: " + num);
    }

    public static void main(String[] args) {
        RecursionExample recursionExample = new RecursionExample();

        System.out.println("Calling demo() from main()...");
        recursionExample.demo(5);
        System.out.println("demo() completed...");
    }
}
