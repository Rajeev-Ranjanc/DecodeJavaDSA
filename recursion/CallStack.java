package recursion;

public class CallStack {
    public static void main(String[] args) {
        pip(5);
    }

    public static void pip(int n) {
        if (n == 0) {
            return;
        }
        //draw call stack and understand in better way
        System.out.print(n+" "); //PRE
        pip(n - 1);
        System.out.print(n+" "); //IN
        pip(n - 1);
        System.out.print(n+" "); //POST
    }
}
