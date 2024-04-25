package stringbuilder;

import java.util.Scanner;

public class StriBuild {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("rajeev");
        StringBuilder sbb = new StringBuilder("yadav");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder ss = new StringBuilder();
        System.out.println(ss.capacity());

        //string builder methods
        System.out.println(sb.compareTo(sbb));
//        System.out.println(sb.reverse());

//        Scanner sc = new Scanner(System.in);
//        StringBuilder sbr = new StringBuilder();
//        sbr.append(sc.nextLine());
//        System.out.println(sbr);

        sb.setCharAt(0,'R');
        System.out.println(sb);
    }
}
