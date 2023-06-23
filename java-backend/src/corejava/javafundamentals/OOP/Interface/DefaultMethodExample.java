package corejava.javafundamentals.OOP.Interface;

interface Default {
    void printMessage();
    default void print() {
        System.out.println("In print() method");
    }
}
public class DefaultMethodExample implements Default {
    public void printMessage() {
        System.out.println("In printMessage()");
    }

    public void print() {
        System.out.println("In print() method of DefaultMethodExample class");
    }

    public static void main(String[] args) {
        DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
        defaultMethodExample.printMessage();
        defaultMethodExample.print();
    }
}
