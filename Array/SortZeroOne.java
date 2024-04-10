//done

import java.util.Arrays;

public class SortZeroOne {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortArray(int[] nums) {
        //first method is simple counting zero and one
        //second method is by two pointer
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {

            //when zero will be at left side
            if (nums[i] == 0) {
                i++;
            }

            //when 1 will be at right side
            else if (nums[j] == 1) {
                j--;
            }

            //when zero will at right and one will at left
//            if(i>j){
//                break;
//            } or if else
            else if (nums[i] == 1 && nums[j] == 0) ;
            {
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
        }
    }
}
