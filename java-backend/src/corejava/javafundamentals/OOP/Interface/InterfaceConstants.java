package corejava.javafundamentals.OOP.Interface;

interface Constants {
    float PI = 3.14f;
    long speedOfLight = 300000000;
}

public class InterfaceConstants implements Constants {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(speedOfLight);
    }
}
