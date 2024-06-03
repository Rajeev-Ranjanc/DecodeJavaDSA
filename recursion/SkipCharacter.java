package recursion;

/*
    Skip all the occurrences of a character from a string
 */
public class SkipCharacter {
    public static void main(String[] args) {
//        skipChars(0, 'a', "Rajeev Ranjan Yadav");
        System.out.println(skipChars2(0, 'e', "Rajeev Ranjeeen", ""));
    }

    public static void skipChars(int index, char ch, String str) {
        if (index == str.length()) {
            return;
        }
        if (str.charAt(index) != ch) {
            System.out.print(str.charAt(index));
        }
        skipChars(index + 1, ch, str);
    }

    public static String skipChars2(int index, char ch, String str, String ans) {
        if (index == str.length()) {
            return ans;
        }
        if (str.charAt(index) != ch) {
            ans += str.charAt(index);
        }
        return skipChars2(index + 1, ch, str, ans);

    }

}
