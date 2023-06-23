package corejava.javafundamentals.SelectionStatements;

public class SwitchExample {
    public static void main(String[] args) {
        String choice = "one"; //1, 2, 3, 4

        switch(choice) {
            case "One":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
        }
    }
}
