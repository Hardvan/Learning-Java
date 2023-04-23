
// ? 1) Create a class Circle and use inheritance to create another class Cylinder from it.
class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }
}

public class InheritancePractice {
    public static void main(String[] args) {

    }
}
