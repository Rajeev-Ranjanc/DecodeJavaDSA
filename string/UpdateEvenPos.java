package string;

/*
It's a very stupid method its using a lot of time as well as space don't do this

 */
public class UpdateEvenPos {
    public static void main(String[] args) {
        String name = "Yadav";
        String str = "";
        for (int i = 0; i < name.length(); i++) {
            if ((i & 1) == 1) {
                str += name.charAt(i);
            } else {
                str += 'a';
            }
        }
        name = str;
        System.out.println(name);
        System.out.println(str);
    }
}
