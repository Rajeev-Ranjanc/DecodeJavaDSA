package string;

public class ModifyCharcterString {
    public static void main(String[] args) {
        String s = "Rajeev";
        //its useless don't do this ever its wasting a lot of time and space
       s= s.substring(0, 2) + "y" + s.substring(3);
        System.out.println(s);

    }

}
