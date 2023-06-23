package corejava.javafundamentals.OOP.Inheritance;

class G {
    void print() {
        System.out.println("In class G");
    }
}

class H extends G {
    void print() {
        System.out.println("In class H");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        H h = new H();
        h.print();
    }
}
