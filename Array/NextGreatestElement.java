package Array;

import java.util.Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {

        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        int nextgreatest = arr[n - 1];

        //brute force approached
//        for (int i = 0; i < n - 1; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1; j < n; j++) {
//                max = Math.max(max, arr[j]);
//            }
//            ans[i] = max;
//
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));

        //optimized one -> in single loop
        //just traverse the loop from last index of the array

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nextgreatest;
            nextgreatest = Math.max(nextgreatest, arr[i]);

        }

        System.out.println(Arrays.toString(ans));

    }
}
