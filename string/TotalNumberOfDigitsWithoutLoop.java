package string;

import java.util.Scanner;

public class TotalNumberOfDigitsWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        s += a;
        System.out.println(s.length());
    }
}
