package exceotionHandling;

public class Throws {
    public static void divisionDemo(int dividend, int divisior) throws ArithmeticException {
        System.out.println(dividend / divisior);
    }

    public static void main(String[] args) {
        divisionDemo(10, 0);
    }
}
