package corejava.javafundamentals.IterationStatements.AssignmentQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

        int temp = num;
        int digitCount = 0;
        while(temp > 0) {
            digitCount++;
            temp = temp / 10;
        }

        temp = num;
        int sumOfPower = 0;
        while(temp > 0) {
            int lastDigit = temp % 10;
            //lastDigit ^ digitCount
            int power = 1;
            for(int i = 1; i <= digitCount; i++) {
                power = power * lastDigit;
            }
            sumOfPower += power;

            temp = temp / 10;
        }

        if(num == sumOfPower) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }
    }
}
