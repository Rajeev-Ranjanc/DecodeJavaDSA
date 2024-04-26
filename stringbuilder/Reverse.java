package stringbuilder;

public class Reverse {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("i am raghav garg");

//        System.out.println(sb);

        StringBuilder ans = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                ans.append(ss.reverse());
                ans.append(" ");
                ss.setLength(0);
            } else {
                ss.append(sb.charAt(i));

            }
        }
        ans.append(ss.reverse());

//        System.out.println(sb.reverse());
        System.out.println(ans);
    }
}
