//https://leetcode.com/problems/find-triangular-sum-of-an-array/
public class TriangularSum {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(triangularSum(nums, nums.length));
    }

    public static int triangularSum(int[] nums, int n) {

        for (int i = 1; i < n; i++) {

            int[] a = new int[n - i];

            for (int j = 0; j < a.length; j++) {

//                a[j] = (nums[j + 1] % 10 + nums[j] % 10) % 10;
                a[j] = (nums[j + 1] % 10 + nums[j] % 10) % 10;

            }

            nums = a;

        }

        return nums[0];

    }

}
