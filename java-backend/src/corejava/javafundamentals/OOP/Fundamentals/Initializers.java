package corejava.javafundamentals.OOP.Fundamentals;

public class Initializers {
    int num;

    static {
        System.out.println("Static initializer 1");
    }

    static {
        System.out.println("Static initializer 2");
    }

    {
        System.out.println("Instance initializer");
        num = 100;
    }

    Initializers() {
        num = num + 10;
    }

    public static void main(String[] args) {
        System.out.println("main() method");

        Initializers initializers = new Initializers();
        System.out.println(initializers.num);
    }
}
