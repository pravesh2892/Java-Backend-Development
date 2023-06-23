package corejava.javafundamentals.OOP.Fundamentals;

class HomoSapiens {
    void run() {
        System.out.println("Homo Sapiens running");
    }
}

class Man extends HomoSapiens {
    void run() {
        System.out.println("Man running");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        HomoSapiens homoSapiens = new Man();
        homoSapiens.run();

        HomoSapiens homoSapiens1 = new HomoSapiens();
        homoSapiens1.run();
    }
}
