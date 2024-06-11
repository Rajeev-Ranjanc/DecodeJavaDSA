package DP;

import java.util.Arrays;

public class IntroDP {
    public static void main(String[] args) {
        System.out.println(bottomUp(5));
    }

    static long topDown(int n) {
        // code here
        if(n<=1){

            return n;
        }

        long[] a = new long[n+1];

        Arrays.fill(a , -1);
        a[0] = 0;
        a[1] = 1;

        return helper(n , a);
//        return 0;

    }
    static long helper(int n , long[] a){

        long m = (long) 1e9 + 7;

        if(a[n] != -1){

            return a[n];

        }

        return a[n] = (helper(n-1 ,a)  + helper(n-2 , a))%m;
    }

    static long bottomUp(int n) {
        // code here
        long m = (long) 1e9 + 7;
        if(n<=1){
            return n;
        }
        long[] a = new long[n+1];

        a[0] = 0;
        a[1] = 1;

        for(int i = 2;i<=n;i++){

            a[i] = (long)a[i-1]%m + a[i-2]%m;

        }
        return a[n];


    }
}

