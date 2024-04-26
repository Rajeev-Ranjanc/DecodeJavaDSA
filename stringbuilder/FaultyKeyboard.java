package stringbuilder;

//https://leetcode.com/problems/faulty-keyboard/
public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "string";
        System.out.println(finalString(s));
    }

    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        int n = s.length();
        while (j < n) {
            if (sb.charAt(j) != 'i') {
                j++;
            } else {
                ans.append(reverse(sb, i, j - 1));
//                sb.setCharAt(j, 'a');
                j=j+1;
                i = j;
            }
        }

        return ans.toString();
    }

    public static StringBuilder reverse(StringBuilder sb, int i, int j) {
        //now reverse from i to j how?? by swapping!

        while (i <= j) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        return sb;
    }
}
