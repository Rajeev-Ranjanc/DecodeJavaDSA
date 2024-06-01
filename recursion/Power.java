package recursion;

/*
    Power of a to b by recursion
 */
public class Power {
    public static void main(String[] args) {

        System.out.println(power_logarithmic(3, 4));

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

    public static long power_logarithmic(int a, int b) {
//        Base case
        if (b == 0) {
            return 1;
        }

        long ans = power_logarithmic(a, b / 2);

        if (b % 2 == 0) {
            return ans * ans;
        }

        return ans * ans * a;
//        TC : O(log(b))
    }
}
