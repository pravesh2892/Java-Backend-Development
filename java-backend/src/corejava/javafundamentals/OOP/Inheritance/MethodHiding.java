package corejava.javafundamentals.OOP.Inheritance;

class E {
    static void printMessage() {
        System.out.println("In class E");
    }
}

class F extends E {
    static void printMessage() {
        System.out.println("In class F");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        F.printMessage();
    }
}
