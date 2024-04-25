package exceotionHandling;

public class ParentChildOrder {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
        //this is error -> java: exception java.lang.ArithmeticException has already been caught
        so, First we need to write child class first while handling the exception and if any exception got uncaught then
        it will be handled by the parent class otherwise every exception will handle by the parent class if we write the
        parent class exception before child class exception
         */
        //this need to write above exception clas
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
}
