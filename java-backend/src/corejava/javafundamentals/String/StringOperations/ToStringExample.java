package corejava.javafundamentals.String.StringOperations;

class Student {
    String name;
    String branch;

    Student(String n, String b) {
        name = n;
        branch = b;
    }

    public String toString() {
        return "[Name: " + name + ", Branch: " + branch + "]";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Student student = new Student("Shyam", "CSE");
        System.out.println(student);
    }
}
