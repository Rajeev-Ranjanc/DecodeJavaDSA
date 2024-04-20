
//https://leetcode.com/problems/spiral-matrix-ii/
/*
Completed

 */
public class Spiral2 {

    public static void main(String[] args) {
        int n = 4;
        int[][] ans = generateMatrix(n);
        for (int[] a : ans) {
            for (int e : a) {
                System.out.print(e + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {

        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = n - 1;
        int val = 1;
        int[][] matrix = new int[n][n];

        while (val <= n * n) {
            for (int i = minc; i <= maxc && val <= n * n; i++) {
                matrix[minr][i] = val++;
            }
            minr++;

            for (int i = minr; i <= maxr && val <= n * n; i++) {
                matrix[i][maxc] = val++;
            }
            maxc--;

            for (int i = maxc; i >= minc && val <= n * n; i--) {
                matrix[maxr][i] = val++;
            }
            maxr--;

            for (int i = maxr; i >= minr && val <= n * n; i--) {
                matrix[i][minc] = val++;
            }
            minc++;
        }

        return matrix;

    }
}
