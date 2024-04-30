public class Bit {
    public static void main(String[] args) {
        System.out.println(minEnd(3,4));
    }
    public static long minEnd(int n, int x) {

        long ans=x;
        for(int i=0;i<n-1;i++)
        {
            ans++;
            ans=ans|x;
        }
        return ans;
    }
}
