//https://leetcode.com/problems/max-consecutive-ones//
/*
    Pretty simple and forward we declare two variable one is cnt to count consecutive 1 and max is
    for storing maximum consecutive and run a loop check if it 1 then increase cnt by one and store
    int max var which is max either max or cnt otherwise cnt become zero
 */
package Array;

public class MaxConsecutive1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int cnt = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
    }
}
