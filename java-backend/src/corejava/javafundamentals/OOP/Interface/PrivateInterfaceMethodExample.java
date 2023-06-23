package corejava.javafundamentals.OOP.Interface;

interface PrivateInterface {
    private void printNum(int num) {
        System.out.println("In printNum() method: " + num);
    }

    default void getNum() {
        printNum(10);
    }
}
public class PrivateInterfaceMethodExample implements PrivateInterface {
    public static void main(String[] args) {
        PrivateInterfaceMethodExample privateInterfaceMethodExample
                = new PrivateInterfaceMethodExample();

        privateInterfaceMethodExample.getNum();
    }
}
