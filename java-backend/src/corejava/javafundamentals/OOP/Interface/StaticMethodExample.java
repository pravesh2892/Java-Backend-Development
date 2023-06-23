package corejava.javafundamentals.OOP.Interface;

interface Example {
    static void printMessage() {
        System.out.println("In interface Example");
    }
}
public class StaticMethodExample implements Example {
    static void printMessage() {
        System.out.println("In class StaticMethodExample");
    }

    public static void main(String[] args) {
        Example.printMessage();
    }
}
