package string;
/*
getting error in last testcases I don't know why while pw teacher's code is submitting
 */

/*
https://leetcode.com/problems/isomorphic-strings/
https://leetcode.com/problems/isomorphic-strings/"\u0000\u0000"
"\u0000c"
 */
public class IsoMorphicString {
    public static void main(String[] args) {

        String s = "\u0000\u0000";
        String t = "\u0000c";
        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {

        //any character can be present in the array so size of array will increase
        char[] a = new char[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int index = ch;
            if (a[index] == '\0') {
                a[index] = dh;
            } else {
                if (a[index] != dh) {
                    return false;
                }
            }
        }
        //by this we checked one - one mapping to from S to T but, we didn't do for T to S so let's do for that
        char[] b = new char[128];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int index = ch;
            if (b[index] == '\0') {
                b[index] = dh;
            } else {
                if (b[index] != dh) {
                    return false;
                }
            }
        }
        return true;
    }
}
