package recursion;

public class Rat_In_MazeWays {
    public static void main(String[] args) {

        int row = 1;
        int col = 1;
        int m = 5;
        int n = 5;
//        System.out.println(maze(row, col, m, n));
        System.out.println(maze2(m, n));

    }

    public static int maze(int row, int col, int m, int n) {
//        Base case
        /*
            Draw diagram will get understand easily
         */
        if (row == m || col == n) {
            return 1;
        }

        int rightWays = maze(row, col + 1, m, n);
        int downWays = maze(row + 1, col, m, n);

        return rightWays + downWays;
    }

    public static int maze2(int m, int n) {
/*
    We can find maze path when we can start the traversal from backward means
    if we want to find the way from 1 1 to 5 5 then we also can traverse from
    5 5 to 1 1 and find way by I can find path in using two variables only.
    If we take right paths then no of column decreases and if we take down paths
    then row decreases once either row or column become 1 then there are only one
    way to go towards the goals so return 1(it will also be base case) and returned
    the sum of right_call and left_call.

 */
        if (m == 1 || n == 1) {
            return 1;
        }

        int rightWays = maze2(m, n - 1);
        int downWays = maze2(m - 1, n);
        return rightWays + downWays;
    }
}
