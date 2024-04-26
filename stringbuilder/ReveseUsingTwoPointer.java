package stringbuilder;

import java.util.Scanner;

/*
Reversing each word in  sentence
 */
public class ReveseUsingTwoPointer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        //
        int n = sb.length();
        int i = 0;
        int j = 0;
        while (j < n) {
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb, i, j - 1);
        System.out.println(sb);


    }

    public static void reverse(StringBuilder sb, int i, int j) {
        //now reverse from i to j how?? by swapping!

        while (i <= j) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }

    }
}
