package string;

/*
https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/
above question is same as the down one.This solution is of above one
https://leetcode.com/problems/is-subsequence/

 */
public class AppendCharcaterSubseq {
    public static void main(String[] args) {
        String s = "abcde", t = "a";
        System.out.println(appendCharacters(s, t));
    }

    public static int appendCharacters(String s, String t) {
        /*
           Again nothing fancy. declared two var i and j to iterate over the string and
           ran a while loop till the i and j don't hit the length of the both s and t string
           if the character of both string match then increase the both i and j otherwise increase
           the index of only first string till don't hit the same character once the i and j hit
           the length of the length of the string while loop will break and I returned the length
           of t - j character need to append in the s string to be sequence

         */
        int i = 0;
        int j = 0;


        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {

                i++;
                j++;

            } else {
                i++;

            }


        }
        return t.length() - j;

    }
}
