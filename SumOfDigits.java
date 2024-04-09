import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while (n!=0){
            ans+=n%10;
            n=n/10;
        }
        System.out.println(ans);
    }
}
