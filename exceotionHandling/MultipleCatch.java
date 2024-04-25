package exceotionHandling;

public class MultipleCatch {
    public static void main(String[] args) {

        int[] a = new int[5];

        try {

                a[5] = 10/0;
//            a[5] = 10 / 0;
        }


        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println(ee.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        //we can write both catch block in same as
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

        finally {
            System.out.println("Hell Priya I will execute always");
        }
    }
}
