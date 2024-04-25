package exceotionHandling;

import java.util.Scanner;

public class ExceptionHanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //throw keyword is used to create custom error message

        if (n < 18) {
            throw new RuntimeException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access Granted :)");
        }
    }
}
