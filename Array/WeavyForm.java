public class WeavyForm {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        weavyForm(arr);
        for (int[] ele : arr) {
            for (int w : ele) {
                System.out.print(w + "  ");
            }
            System.out.println();
        }
    }

    static void weavyForm(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0) {
                //reverse the entire row
                for (int j = 0; j <= arr.length / 2; j++) {
                    //swap
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][arr[0].length - 1 - j];
                    arr[i][arr[0].length - 1 - j] = temp;
                }
            }

        }
    }
}
