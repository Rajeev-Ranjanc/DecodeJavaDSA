import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i + 1;
        }

        int[] b = Arrays.copyOf(a, a.length);
        for (int i = 0; i < 5; i++) {
            b[i] = i + 1;
        }
        System.out.println(a[0]);
        b[0] = 1000;
        System.out.println(b[0]);
        System.out.println(a[0]);
    }
}
