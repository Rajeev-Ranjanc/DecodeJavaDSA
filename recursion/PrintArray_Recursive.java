package recursion;

public class PrintArray_Recursive {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 6, 8, 9, 12, 3};
//        printArray(a, 0);
        printString(0, "Rajeev Ranjan Yadav");
    }

    public static void printArray(int[] nums, int index) {
        if (index == nums.length) {
            return;
        }
        System.out.print(nums[index] + " ");
        printArray(nums, index + 1);
    }

    public static void printString(int index, String name) {

        if (index == name.length()) {
            return;
        }
        System.out.print(name.charAt(index)+" ");
        printString(index + 1, name);

    }
}
