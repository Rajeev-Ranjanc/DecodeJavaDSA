package string;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/longest-palindrome/?envType=daily-question&envId=2024-06-04

 */
public class LongestPalindrom {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        /*
            Congrats boy
            Nothing fancy I need to return the length of longest palindrome I can make
            from the given String so, I start traversing into string and check is this
            character present in the set if yes then added the +2 (because I can put those 2
            character one at first end and other one at other end) into var which is need
            to be return and remove that element from the stack. otherwise added that character
            into stack. and after traversing all the string check is stack is empty if yes then
            returned the answer variable otherwise returned by adding +1 because I can make palindrome of
            odd length

         */
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                ans += 2;
            } else {
                set.add(ch);
            }
        }
        if (set.isEmpty()) {
            return ans;
        }
        return ans + 1;
    }
}
