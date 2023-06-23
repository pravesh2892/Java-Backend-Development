package corejava.javafundamentals.OOP.Inheritance;


class K {
    int k1;

    K(int k) {
        k1 = k;
    }

    void printK() {
        System.out.println("k1: " + k1);
    }
}

class L extends K {
    int l1;

    L(int k, int l) {
        super(k);
        l1 = l;
    }

    void printL() {
        System.out.println("l1: " + l1);
    }
}

class M extends L {
    int m1;

    M(int k, int l, int m) {
        super(k, l);
        m1 = m;
    }

    void printM() {
        System.out.println("m1: " + m1);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        M m = new M(1, 2, 3);

        m.printK();
        m.printL();
        m.printM();
    }
}
