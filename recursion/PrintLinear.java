package recursion;

public class PrintLinear {
    public static void main(String[] args) {
        printLine(1,5);
    }

    public static void printLine(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        i++;
        printLine(i, n);
    }

    public static void printLine2(int n) {
        if (n< 1) {
            return;
        }

        printLine2(n-1);
        System.out.print(n + " ");
    }
}
