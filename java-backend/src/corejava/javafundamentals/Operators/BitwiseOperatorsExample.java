package corejava.javafundamentals.Operators;

public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int num1 = 11; //1011
        int num2 = 13; //1101

        int result;
        result = num1 & num2; //1001
        System.out.println(result);

        result = num1 | num2; //1111
        System.out.println(result);

        result = ~num1; //~(00000000000000000000000000001011) -> (11111111111111111111111111110100) -> 1's complement -> 00000000000000000000000000001011 + 1
        System.out.println(result);

        result = num1 ^ num2; //0110
        System.out.println(result);

        num1 = -num1; //-11 -> 00000000000000000000000000001011 -> 11111111111111111111111111110100 + 1 -> 11111111111111111111111111110101 >> 2 = 11111111111111111111111111111101 -> 00000000000000000000000000000010 + 1 = 00000000000000000000000000000011 = 3
        result = num1 >> 2;
        System.out.println(result);

        result = num1 >>> 2;
        System.out.println(result); //-11 -> 00000000000000000000000000001011 -> 11111111111111111111111111110100 + 1 -> 11111111111111111111111111110101 >>> 2 -> 00111111111111111111111111111101

        result = num2 << 2; //13 -> 00000000000000000000000000001101 -> 00000....000110100
        System.out.println(result);

        num2 = -num2;
        result = num2 << 2;
        System.out.println(result);

        System.out.println("-----");

        int num = 13;
        num &= 2; //num = 13 & 2; -> 1101 & 0010 -> 0000
        System.out.println(num);
    }
}
