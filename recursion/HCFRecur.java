package recursion;

import java.util.Scanner;

public class HCFRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(hcf(a, b));
        System.out.println(gcdRecursive(41, 90));


    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static int hcf(int a, int b) {
//     Badmethod
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return -1;
//        TC : O(min(a,b) when a and b both will be prime number

    }
}
