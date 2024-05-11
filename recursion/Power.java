package recursion;

/*
    Power of a to b by recursiion
 */
public class Power {
    public static void main(String[] args) {

        System.out.println(powerUsingRecursion(5, 3));

    }

    public static long powerUsingRecursion(int a, int b) {

        if (b == 0) {

            return 1;

        }

        return a * powerUsingRecursion(a, b - 1);
    }
}
