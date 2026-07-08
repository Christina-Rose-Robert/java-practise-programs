class Shape {
    // Method to be overridden
    void area() {
        System.out.println("Calculating area of a shape...");
    }
}
class Rectangle extends Shape {
    int length, breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Overriding the area method
    @Override
    void area() {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area + " square units");
    }
}
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Overriding the area method
    @Override
    void area() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area of the circle: " + area + " square units");
    }
}
public class MethodOverridingExample {
    public static void main() {
        // Superclass reference to subclass objects
        Shape s;

        // Rectangle object
        s = new Rectangle(5, 10);
        s.area(); // Calls the overridden method in Rectangle

        // Circle object
        s = new Circle(7);
        s.area(); // Calls the overridden method in Circle
    }
}