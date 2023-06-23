package corejava.javafundamentals.SelectionStatements;

public class NestedSwitchExample {
    public static void main(String[] args) {
        String day = "Wednesday";
        String meal = "breakfast";

        switch(day) {
            case "Monday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
                switch(meal) {
                    case "breakfast":
                        System.out.println("B1");
                        break;
                    case "lunch":
                        System.out.println("L1");
                        break;
                    case "dinner":
                        System.out.println("D1");
                        break;
                }
                break;
            case "Tuesday":
                switch(meal) {
                    case "breakfast":
                        System.out.println("B2");
                        break;
                    case "lunch":
                        System.out.println("L2");
                        break;
                    case "dinner":
                        System.out.println("D2");
                        break;
                }
                break;
        }
    }
}
