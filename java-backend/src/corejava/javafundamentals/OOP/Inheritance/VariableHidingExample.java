package corejava.javafundamentals.OOP.Inheritance;

class C {
    int x;

    void printC() {
        String className = this.getClass().getSimpleName();
        System.out.println("In class " + className + ", x: " + x);
    }
}

class D extends C {
    int x;

    void printD() {
        String className = this.getClass().getSimpleName();
        System.out.println("In class " + className + ", x: " + x);
    }
}

public class VariableHidingExample {
    public static void main(String[] args) {
        D d = new D();

        d.x = 10;
        d.printD();
        d.printC();
    }
}
