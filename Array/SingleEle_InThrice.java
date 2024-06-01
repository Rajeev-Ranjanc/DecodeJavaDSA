package Array;

import java.util.Arrays;

public class SingleEle_InThrice {
    public static void main(String[] args) {
        int N = 4;
        int arr[] = {1, 10, 1, 10,2,10};
        System.out.println(singleElement(arr, N));
    }

    static int singleElement(int[] arr, int N) {

        //        Optimal one
        int one = 0;
        int two = 0;
        for (int num : arr) {
            one = (one ^ num) & ~two;
            two = (two ^ num) & ~one;
        }
        return one;



//        Brute force -> Map
//        TC: O(n+log(n)) SC : O(n)

//        Next Way -> Bit manipulation if set a bit of all elements is of multiple of 3 then we
//        set that bit of answer var.
//        TC : O(nlog(n)) n will always be 32 bit

//        Third way using Sorting
//        TC : O(nlog(n) Sc: O(1) this is better then bit manipulation because here n will not always be 32
//        Arrays.sort(arr);
//        for (int i = 1; i < N; ) {
//            if (arr[i - 1] != arr[i]) {
//                return arr[i - 1];
//            }
//            i += 3;
//        }
//        return arr[N - 1];
//        TC : O(nlog(n)) + N/3
//        SC : O(1)



    }

}
