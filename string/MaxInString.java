package string;

/*
String Comparison

 */
public class MaxInString {
    public static void main(String[] args) {
        String[] arr = {"0078", "78"};
        String ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            ans = max(ans, arr[i]);
        }
        System.out.println(ans);
    }

    public static String max(String a, String b) {
        //purify function to remove the zero from every number which is at starting of any number
        String s = purify(a);
        String t = purify(b);
        //after purify we can say that number will be greater which will have more length
        if (s.length() > t.length()) {
            return a;
        }
        if (s.length() < t.length()) {
            return b;
        }
        //now both string may have of same length so for that we can compare character wise length are enequal
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i)) {
                    return a;
                } else {
                    return b;
                }
            }
        }

//        now again purified is also same then like 0078 or 78 to handle this situation this code is for
        if (a.length() > b.length()) {
            return a;
        }
        return b;



    }

    public static String purify(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0') {
                return a.substring(i);
            }
        }
        return a;
    }

}
