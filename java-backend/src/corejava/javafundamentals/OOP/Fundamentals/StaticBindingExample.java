package corejava.javafundamentals.OOP.Fundamentals;

class Human {
    static void run() {
        System.out.println("Human running");
    }
}

class Boy extends Human {
    static void run() {
        System.out.println("Boy running");
    }
}

public class StaticBindingExample {
    public static void main(String[] args) {
        Human human = new Boy();
        human.run();

        Human human1 = new Human();
        human1.run();
    }
}
