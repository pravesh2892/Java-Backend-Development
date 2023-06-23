package corejava.javafundamentals.OOP.Inheritance;

class Box {
    double length;
    double width;
    double height;

    Box() {
        this(-1, -1, -1);
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return (length * width * height);
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this(-1, -1, -1, -1);
    }

    BoxWeight(double l, double w, double h, double wt) {
        super(l, w, h);
        weight = wt;
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(10, 7, 9, 100);
        BoxWeight b2 = new BoxWeight(100, 70, 90, 1000);

        double volume = b1.volume();
        System.out.println("Volume: " + volume);
        System.out.println("Weight: " + b1.weight);

        volume = b2.volume();
        System.out.println("Volume: " + volume);
        System.out.println("Weight: " + b2.weight);
    }
}
