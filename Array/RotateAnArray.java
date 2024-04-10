//https://leetcode.com/problems/rotate-array/submissions/
/*
Done on leetcode
In this problem I have approached this first I reverse entire array, and then I have revered till the Kth item and after that
again I reversed the rest array from k+1 to length of the array and finally simply returns
 */

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        rotate(nums, k);
        rotate2(nums, k);
//        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    /*
    Although this is not optimized one for optimization we can do this is 100 optimized one in this
    First we reverse the array from 0 to n-1-k (first elements which does not contain kth item) then second time
    reversed the array elements from n-k(from kth) to length of the array and then again reverse the complete array
     */
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1 - k);
        reverse(nums, n - k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        //reversing entire array
        for (int i = 0; i < n / 2; i++) {
            swap(nums, i, n - 1 - i);
        }
        //reversing upto kth element
        for (int i = 0; i < k / 2; i++) {
            swap(nums, i, k - i - 1);
        }
        //now again reversing rest half of the array
        for (int i = k; i < (n + k) / 2; i++) {
            swap(nums, i, (n + k - 1 - i));
            // System.out.println();
//            System.out.println(i + " " + (n + k - 1 - i));
        }

    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
