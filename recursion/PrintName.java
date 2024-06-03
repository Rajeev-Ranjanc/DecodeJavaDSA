package recursion;

public class PrintName {
    public static void main(String[] args) {
        print(0);
    }

    public static void print(int i) {
        if (i == 5) {
            return;
        }
        System.out.println("Rajeev Ranjan");
        i++;
        print(i);
    }
}
