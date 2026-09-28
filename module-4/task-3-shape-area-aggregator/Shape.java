public class Shape {

    public double calculateArea() {
        return 0;
    }

    public static double calculateTotalArea(Shape[] shapes) {

        double total = 0;

        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }

        return total;
    }

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(10, 4)
        };

        double total = calculateTotalArea(shapes);

        System.out.printf(
            "Total Area: %.2f%n",
            total
        );
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
