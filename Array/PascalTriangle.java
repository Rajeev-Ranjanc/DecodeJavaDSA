import java.util.ArrayList;
import java.util.List;

/*
//https://leetcode.com/problems/pascals-triangle/


int this first we create an arraylist and added one in that list and that list again added into another arraylist everytime
and then again second time we run two loop and set the value of internal arraylist to the sum of previous arraylist.get
i + previous arraylist.get i-1 and finally return that arraylist.

We can optimize this code by this approach we can see that we are adding 1 only when the col is 0 or col is lst and nest time
we are doing same previous procedure, so we can do this via if  j==0 || j==i then add 1 otherwise follow that rules.

 */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
//        List<List<Integer>> a = generate(n);
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println(a.get(i));
//        }

        System.out.println(getRow(0));

    }

    static int[][] gener(int n) {

//        for (int i = 0; i < n; i++) {
//            int k = 1;
//            for(int j = 0;j<=i;j++){
//                System.out.print(k+" ");
//                k++;
//            }
//
//            System.out.println();
//        }

        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ans[i][j] = 1;
            }
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i; j++) {

                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }
        return ans;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(list);
        }

//        for (int i = 2; i < numRows; i++) {
//            for (int j = 1; j < i; j++) {
//                ans.get(i).set(j , ans.get(i-1).get(j) + ans.get(i-1).get(j-1) );
//            }
//        }
        return ans;
    }

//    https://leetcode.com/problems/pascals-triangle-ii/
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
    }
}
