package corejava.javafundamentals.OOP.Encapsulation.SamePackageSubClass;


class A {
    static int defaultA;
    static public float publicB;
    static protected double protectedC;
    static private String privateD;
}
public class SamePackageSubClass extends A {
    public static void main(String[] args) {
        System.out.println(defaultA);
        System.out.println(publicB);
        System.out.println(protectedC);
        /*
        System.out.println(privateD);

         */
    }
}
