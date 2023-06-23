package corejava.javafundamentals.SelectionStatements.AssignmentQuestions;

import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your income: ");
        float amount = scanner.nextFloat();

        float taxAmount = 0.0f;

        if(amount >= 0 && amount < 300000) {
            taxAmount = 0;
        }
        else if(amount >= 300000 && amount < 600000) {
            taxAmount = 0 + (amount - 300000) * 0.05f;
        }
        else if(amount >= 600000 && amount < 900000) {
            taxAmount = 0 + (0.05f * 300000) + (amount - 600000) * 0.1f;
        }
        else if(amount >= 900000 && amount < 1200000) {
            taxAmount = 0 + (0.05f * 300000) + (0.1f * 300000) + (amount - 900000) * 0.15f;
        }
        else if(amount >= 1200000 && amount < 1500000) {
            taxAmount = 0 + (0.05f * 300000) + (0.1f * 300000) + (0.15f * 300000) + (amount - 1200000) * 0.2f;
        }
        else {
            taxAmount = 0 + (0.05f * 300000) + (0.1f * 300000) + (0.15f * 300000) + (0.2f * 300000) + (amount - 1500000) * 0.3f;
        }

        float netSalary = amount - taxAmount;

        System.out.println("Gross Salary: " + amount);
        System.out.println("Income Tax: " + taxAmount);
        System.out.println("Net Salary: " + netSalary);
    }
}
