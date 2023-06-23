package corejava.javafundamentals.NestedClass.NonStaticNestedClass;

public class NonStaticNestedExample {
    static int defaultStaticInt = 10;
    float defaultNonStaticFloat = 3.14f;
    private String defaultNonStaticString = "Test";

    class MemberInner {
        void printMemberInner() {
            System.out.println(defaultStaticInt);
            System.out.println(defaultNonStaticFloat);
            System.out.println(defaultNonStaticString);
        }
    }

    public static void main(String[] args) {
        NonStaticNestedExample nonStaticNestedExample = new NonStaticNestedExample();
        MemberInner memberInner = nonStaticNestedExample.new MemberInner();

        memberInner.printMemberInner();
    }
}
