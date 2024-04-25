package stringbuilder;

import java.util.Scanner;

public class ToggleAllCharacter {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        sb.append(sc.nextLine());

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 97) {
                sb.setCharAt(i, (char) (sb.charAt(i) - 32));
            } else {
                sb.setCharAt(i, (char) (sb.charAt(i) + 32));
            }
        }

        System.out.println(sb);
    }
}
