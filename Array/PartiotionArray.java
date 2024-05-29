package Array;
/*
    https://leetcode.com/problems/partition-array-according-to-given-pivot/submissions/
    I know this is not optimized one but still it gives motivation to solve the problem.
    simply declared 3 Arraylist first one is for less than the pivot and second is for
    equal to pivot and third one is for greater than the pivot number and finally one by
    one I override the original array value from the arraylist and returned original arr
 */
import java.util.ArrayList;
import java.util.Arrays;

public class PartiotionArray {
    public static void main(String[] args) {
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                a.add(nums[i]);
            } else if (nums[i] == pivot) {
                b.add(nums[i]);
            } else {
                c.add(nums[i]);
            }
        }

        int l = 0;
        int i = 0;
        while (l < a.size()) {
            nums[i] = a.get(l);
            l++;
            i++;
        }
        l = 0;
        while (l < b.size()) {
            nums[i] = b.get(l);
            i++;
            l++;
        }
        l = 0;
        while (l < c.size()) {
            nums[i] = c.get(l);
            i++;
            l++;
        }

        return nums;

    }
}
