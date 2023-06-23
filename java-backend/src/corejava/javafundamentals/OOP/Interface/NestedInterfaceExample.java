package corejava.javafundamentals.OOP.Interface;

class B {
    interface C {
        void print();
    }
}

class D implements B.C {
    public void print() {
        System.out.println("In class D which implements C");
    }
}

public class NestedInterfaceExample {
    public static void main(String[] args) {
        D d = new D();
        d.print();

        B.C c;
        c = new D();
        c.print();
    }
}
