package corejava.javafundamentals.OOP.Fundamentals;

abstract class Shape {
    double dimension1;
    double dimension2;

    Shape(double d1, double d2) {
        dimension1 = d1;
        dimension2 = d2;
    }
    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        return (dimension1 * dimension2);
    }
}

class Square extends Shape {
    Square(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        return (dimension1 * dimension2);
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Shape shape;

        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(10, 10);

        double area;

        shape = rectangle;
        area = shape.area();
        System.out.println("Area of rectangle: " + area);

        shape = square;
        area = shape.area();
        System.out.println("Area of square: " + area);
    }
}
