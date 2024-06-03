package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<String> list = new ArrayList<>();

    public static void printSubset(int index, String s, String ans) {
        if (index == s.length()) {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(index);

        printSubset(index + 1, s, ans + ch); // take
        printSubset(index + 1, s, ans); // not take
    }

    public static void printSubset2(int index, String s, String ans) {

        if (index == s.length()) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(index);
//        work of these 2 lines are doing same the next lines
//        printSubset2(index + 1, s, ans); // not take
//        printSubset2(index + 1, s, ans + ch); // take

//        these calls are not same as the above recursive calls.
        printSubset2(index + 1, s, ans);
        ans += ch;
        printSubset2(index + 1, s, ans);

    }

    public static void main(String[] args) {
        list = new ArrayList<>();
        printSubset2(0, "abc", "");

        System.out.println(list);
    }
}
