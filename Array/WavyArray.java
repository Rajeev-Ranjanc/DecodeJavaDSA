import java.lang.reflect.Array;
import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
public class WavyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void convertToWave(int n, int[] a) {
        // code here
        for (int i = 1; i < n; i += 2) {
            swap(a, i - 1, i);
        }
    }

    private static void swap(int[] a, int f, int s) {
        int temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }
}
