/*Hierarchical Inheritance is a type of inheritance in Java where multiple classes inherit from a single parent class. 
Each subclass gets the properties and behaviors (methods and variables) of the same parent class, 
but they can also have their own unique methods. */

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    void area(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display(); // Inherited from Shape
        c.area(5); // Specific to Circle

        Rectangle r = new Rectangle();
        r.display(); // Inherited from Shape
        r.area(4, 6); // Specific to Rectangle
    }
}
