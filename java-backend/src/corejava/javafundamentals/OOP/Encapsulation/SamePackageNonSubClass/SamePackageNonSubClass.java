package corejava.javafundamentals.OOP.Encapsulation.SamePackageNonSubClass;

class A {
    static int defaultA;
    static public float publicB;
    static protected double protectedC;
    static private String privateD;
}

public class SamePackageNonSubClass {
    public static void main(String[] args) {
        System.out.println(A.defaultA);
        System.out.println(A.publicB);
        System.out.println(A.protectedC);
        //System.out.println(A.privateD);
    }
}
