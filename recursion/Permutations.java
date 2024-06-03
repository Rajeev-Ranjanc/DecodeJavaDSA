package recursion;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/permutations/

 */
public class Permutations {
    public static void main(String[] args) {
////        printPermutations("", "abc");
//        System.out.println(permutations2("abc", ""));


        int[] nums = {1, 2, 3};

        List<List<Integer>> a = permute(nums);

        for (List<Integer> aa : a) {
            System.out.println(aa);
            ;
        }

    }

    public static void printPermutations(String ans, String s) {
        /*
            Base case
        */
        if (s.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            String left = s.substring(0, i); // here ith index is exclusive
            String right = s.substring(i + 1);
            printPermutations(ans + ch, left + right);

        }
//        TC : O(n * n-1 * n-2) -> n!
    }

    public static ArrayList<String> permutations2(String s, String ans) {

        ArrayList<String> list = new ArrayList<>();
/*
        understand this. this is very important
 */
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String left = s.substring(0, i); // here ith index is exclusive

            String right = s.substring(i + 1);

            list.addAll(permutations2(left + right, ans + ch));

        }

        return list;
        //        TC : O(n * n-1 * n-2) -> n!

    }

    //    https://leetcode.com/problems/permutations/
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, list);
        return list;

    }

    public static void helper(int[] nums, int index, List<List<Integer>> list) {
        if (index == nums.length) {
            List<Integer> a = new ArrayList<>();
            for (int num : nums) {
                a.add(num);
            }
            list.add(a);
            return;
        }

        // Recursively generate permutations
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1, list);
            swap(nums, index, i); // backtrack
        }
    }

    public static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }


}
