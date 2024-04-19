//https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

import java.util.*;

public class Snake {
    public static void main(String[] args) {
        int[][] matrix = {
                {45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}
        };
        System.out.println(snakePattern(matrix));
    }

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    ans.add(matrix[i][j]);
                }

            } else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;


    }
}
