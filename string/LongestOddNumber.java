package string;

/*
    https://leetcode.com/problems/largest-odd-number-in-string/
 */
public class LongestOddNumber {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(largestOddNumber(num));

    }

    public static String largestOddNumber(String num) {
        /*
            Nothing special and fancy. just iterate from left of the string and
            check the last number is it even if yes then remove that character from
            right of string using substring method if no them break the loop and
            returned the rest string
         */
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int ch = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (ch % 2 == 0) {
                num = num.substring(0, i);
            } else {
                break;
            }

        }
        return num;
    }

}
