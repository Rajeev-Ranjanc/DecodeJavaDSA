package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(20));
    }
    public static int fibo(int n){

        if(n<=1){
            return n;
        }

        return fibo(n-2) + fibo(n-1);
    }
}
