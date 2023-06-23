package corejava.javafundamentals.OOP.Fundamentals;

class Sport {
    void display() {
        System.out.println("In class Sport");
    }
}

class Cricket extends Sport {
    void display() {
        System.out.println("In class Cricket");
    }
}

class Badminton extends Sport {
    void display() {
        System.out.println("In class Badminton");
    }
}

public class UpcastingDowncastingExample {
    public static void main(String[] args) {
        //upcasting
        Sport cricketRef = new Cricket();
        Sport badmintonRef = new Badminton();
        cricketRef.display();
        badmintonRef.display();

        System.out.println("-----");

        //downcasting
        Sport sportRef = new Cricket();
        Cricket cricket = (Cricket) sportRef;
        cricket.display();
    }
}
