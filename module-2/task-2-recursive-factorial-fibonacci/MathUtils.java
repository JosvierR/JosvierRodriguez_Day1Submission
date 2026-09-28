public class MathUtils {

    public static long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Number cannot be negative"
            );
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Number cannot be negative"
            );
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println(
                "Factorial of " + number + ": "
                        + factorial(number)
        );

        System.out.println(
                "Fibonacci of " + number + ": "
                        + fibonacci(number)
        );
    }
}
