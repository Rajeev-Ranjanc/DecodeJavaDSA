package recursion;

/*
    https://leetcode.com/problems/count-and-say/
    countAndSay is same as the string compression visit string compression but here
    we get a number to generate string while in stringCompression there was the string
    to do so, let's see
    countAndSay(1) = 1;
    countAndSay(2) = 11(one(count) one(say) present in countAndSay(1))
    countAndSay(3) = 21
    countAndSay(4) = 1211
    countAndSay(5) = 111221
    ...
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));

    }

    public static String countAndSay(int n) {
//        Base case
        if (n == 1) {
            return "1";
        }

//        recursive call
        String s = countAndSay(n - 1) + '@';
        String ans = "";
//        @ -> trick (hack) otherwise we will have to add last occurrences outside the while loop once
//        by this we don't need to do this
        int i = 0;
        int j = 0;
        while (j < s.length()) {

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int count = j - i;
                ans += count;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }

}
