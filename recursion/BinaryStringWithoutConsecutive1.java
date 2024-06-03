package recursion;

import java.util.ArrayList;
import java.util.List;

/*
    Generate all binary string of length n without consecutive 1
    PayTm Amazon Google Swiggy Wells Fargo
 */
public class BinaryStringWithoutConsecutive1 {
    public static void main(String[] args) {
        System.out.println(printBinaryString2(5));
//        System.out.println(countStrings(2));
    }

    public static void printBinaryString(int n, String ans) {
        if (ans.length() == n) {
            System.out.print(ans + " ");
            return;
        }

        if (ans.isEmpty() || ans.charAt(ans.length() - 1) == '0') {
            printBinaryString(n, ans + 0);
            printBinaryString(n, ans + 1);
        } else {
            printBinaryString(n, ans + 0);
        }
    }

    public static List<String> printBinaryString2(int n) {
        List<String> list = new ArrayList<>();
        helper(n, "", list);

        return list;
    }

    public static void helper(int n, String ans, List<String> list) {
        if (ans.length() == n) {
            list.add(ans);
            return;
        }
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) == '0') {
            helper(n, ans + 0, list);
            helper(n, ans + 1, list);
        } else
            helper(n, ans + 0, list);

    }

    public static long countStrings(int n) {
        // code here

       return help(n, "");

    }

    private static int help(int n, String ans) {
        int c = 0;
        if (n == ans.length()) {
            return 1;
        }
        if (ans.isEmpty() || ans.charAt(ans.length() - 1) == '0') {
            c += help(n, ans + "0");
            c += help(n, ans + "1");
        } else {
            c += help(n, ans + "0");
        }
        return c;
    }
}
