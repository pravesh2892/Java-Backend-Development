package corejava.javafundamentals.OOP.Fundamentals;

public class ArraysOrObjects {
    String message;
    ArraysOrObjects demoMethod() {
        ArraysOrObjects demo = new ArraysOrObjects();
        demo.message = "I am demo object";

        return demo;
    }

    public static void main(String[] args) {
        ArraysOrObjects arraysOrObjects = new ArraysOrObjects();

        ArraysOrObjects d = arraysOrObjects.demoMethod();

        System.out.println(d.message);
    }
}
