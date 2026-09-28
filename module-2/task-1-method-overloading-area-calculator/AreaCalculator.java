public class AreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static double calculateArea(
            double base,
            double height,
            boolean isTriangle
    ) {

        if (isTriangle) {
            return (base * height) / 2;
        }

        return 0;
    }

    public static void main(String[] args) {

        double circleArea = calculateArea(5);

        double rectangleArea = calculateArea(4, 6);

        double triangleArea = calculateArea(10, 4, true);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}
