package recursion;

/*
    Power of a to b by recursion
 */
public class Power {
    public static void main(String[] args) {

        System.out.println(power_logarithmic(2, 12));

    }

    public static long powerUsingRecursion(int a, int b) {
//        if (a == 0 && b == 0) {
//            System.out.println("undefined");
//            return -1;
//        }
//        to handle O^O case
        if (b == 0) {

            return 1;

        }

        return a * powerUsingRecursion(a, b - 1);
//        TC : O(b)

    }

    public static int power_logarithmic(int x, int n) {
//        Base case

        if (n == 0) {
            return 1;
        }

        if (n < 0) {

            x = 1 / x; // to make x in denominator

            n = -1 * n; //to make n positive

        }
        int ans = power_logarithmic(x, n / 2);

        if (n % 2 == 0) {

            return ans * ans;

        }

        return ans * ans * x;
//        TC : O(log(b))
    }
}
