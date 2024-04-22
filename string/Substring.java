package string;

public class Substring {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(2));
        System.out.println(s.substring(0, 2));

//        printing all substring
        for (int i = 1; i <= s.length(); i++) {
            System.out.print(s.substring(0, i) + " ");
        }

        System.out.println();
        System.out.println();
//        print all substring
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }


    }
}
