package corejava.javafundamentals.OOP.Interface;

interface C {
    void printC();
}

interface E extends C {
    void printE();
}
public class InterfaceChain implements E {
    public void printC() {
        System.out.println("In printC() method");
    }

    public void printE() {
        System.out.println("In printE() method");
    }

    public static void main(String[] args) {
        InterfaceChain interfaceChain = new InterfaceChain();
        interfaceChain.printC();
        interfaceChain.printE();
    }
}
