package corejava.javafundamentals.OOP.Fundamentals;

class Student {
    String registrationNumber;
    String name;
    float cgpa;
    static float averageCgpa;

    Student() {
        this("test", "test", 0.1f);
    }

    Student(String registrationNumber, String name, float cgpa) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    void printStudentDetails(String prefix) {
        printStudentDetailsWithPrefix(prefix, this);
    }

    void printStudentDetailsWithPrefix(String prefix, Student s) {
        System.out.println(s.registrationNumber);
        System.out.println(prefix + " " + s.name);
        System.out.println(s.cgpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printStudentDetails("Mr.");

        Student student2 = new Student("ABC123", "Ram", 9.9f);
        student2.printStudentDetails("Mr.");
    }
}
