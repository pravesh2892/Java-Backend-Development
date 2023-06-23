package corejava.javafundamentals.NestedClass.NonStaticNestedClass;

class OuterII {
    static int defaultStaticInt = 10;
    float defaultNonStaticFloat = 3.14f;
    private String defaultNonStaticString = "Test";

    class MemberInner {
        static int defaultStaticIntInner = 1;
        float defaultNonStaticFloatInner = 1.1f;


        void printMemberInner() {
            System.out.println(defaultStaticInt);
            System.out.println(defaultNonStaticFloat);
            System.out.println(defaultNonStaticString);
        }
    }

    void printMemberOuterII() {
        MemberInner memberInner = new MemberInner();

        System.out.println(MemberInner.defaultStaticIntInner);
        System.out.println(memberInner.defaultNonStaticFloatInner);
    }
}
public class NonStaticNestedExampleII {
    public static void main(String[] args) {
        OuterII outerII = new OuterII();
        OuterII.MemberInner memberInner = outerII.new MemberInner();

        memberInner.printMemberInner();

        outerII.printMemberOuterII();
    }
}
