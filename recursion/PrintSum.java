package recursion;

public class PrintSum {
    public static void main(String[] args) {
//        System.out.println(printSum(5));
        sum(10, 0);
    }


    public static int printSum(int n) {

        if (n == 0) {
            return 0;
        }
        return n + printSum(n - 1);
    }

    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        sum(n - 1, s + n);
    }
}
