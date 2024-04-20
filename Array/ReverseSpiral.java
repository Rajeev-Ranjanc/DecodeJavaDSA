
import java.util.Arrays;

public class ReverseSpiral {
    public static void main(String[] args) {
        int[][] ans = {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        System.out.println(Arrays.toString(reverseSpiral(ans.length, ans[0].length, ans)));
    }

    public static int[] reverseSpiral(int R, int C, int[][] matrix) {
        int[] ans = new int[R * C];
        int index = 0;
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length - 1;
        int maxc = matrix[0].length - 1;

        //or we can do minc <= maxc it will also work
        //&& minc <= maxc
        while (minr <= maxr) {

            //first condition
            //here constant will maxr -> this will add all elements of first row at first call
            for (int i = minc; i <= maxc; i++) {
                ans[index++] = matrix[minr][i];
            }
            minr++;

            //second condition -> for the right column
            //constant will be maxc -> clear it by making diagram
            if (minr > maxr || minc > maxc) break; // to avoid adding the last only elements by two times
            //or we can do this by if we calculate the total no of elements in matrix and check a condition at
            //the very first time while entering the first loop that while list.size does not equal to total no of elements
            for (int i = minr; i <= maxr; i++) {
                ans[index++] = matrix[i][maxc];
            }
            maxc--;

            //third condition -> constant will be maximum row
            //for the bottom row from right to left all verify by diagram
            if (minr > maxr || minc > maxc) break;
            for (int i = maxc; i >= minc; i--) {
                ans[index++] = matrix[maxr][i];
            }
            maxr--;

            //last condition will be for the left most column for that column will be constant
            //while loop will max row to min row from bottom to up

            for (int i = maxr; i >= minr; i--) {
                ans[index++] = matrix[i][minc];
            }
            minc++;

        }
//now reverse the entire array which is to be returned
        for (int i = 0; i < ans.length / 2; i++) {
//            swap
            swap(ans, i, ans.length - 1 - i);
        }
        return ans;
    }

    private static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
