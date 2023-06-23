package corejava.javafundamentals.OOP.Inheritance;

class I {
    int x;

    I(int x) {
        this.x = x;
    }

    void showX() {
        System.out.println("x in I: " + x);
    }
}

class J extends I {
    int x;

    J(int x1, int x2) {
        super(x1);
        x = x2;
    }

    void showX() {
        super.showX();
        System.out.println("x in J: " + x);
    }
}

public class SuperKeywordExampleII {
    public static void main(String[] args) {
        J j = new J(10, 20);
        j.showX();
    }
}
