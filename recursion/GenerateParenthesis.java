package recursion;
/*
    https://leetcode.com/problems/generate-parentheses/
    Wrong approach is must in the interview

 */
import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
//        print(0, 0, 3, "");
        System.out.println(generateParenthesis(2));

    }

    public static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        helper(0, 0, n, "", ans);
        return ans;


    }

    public static void helper(int opening, int closing, int n, String s, List<String> ans) {
//        at the interview time check striver sheet for hot=nt and that is important

//        Base case
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

//        Opening call when we will call opening? when the opening is less than n
        if (opening < n)
            helper(opening + 1, closing, n, s + "(", ans);
//        closing call when? when there will close less than open only then
        if (closing < opening)
            helper(opening, closing + 1, n, s + ")", ans);

    }


    public static void print(int opening, int closing, int n, String s) {
//        at the interview time check striver sheet for hot=nt and that is important

//        Base case
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }

//        Opening call when we will call opening? when the opening is less than n
        if (opening < n)
            print(opening + 1, closing, n, s + "(");

//        closing call when? when there will close less than open only then
        if (closing < opening)
            print(opening, closing + 1, n, s + ")");

    }
}
