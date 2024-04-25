package string;

public class Equals {
    public static void main(String[] args) {
        String name = "Rajeev";
        String name2 = "Raj";
        name2 += "eev";

        String name3 = new String("Rajeev");
        System.out.println(name == name3); //-> guess what?? false! why?? read comment section its checking is name and name3
        // referencing same Rajeev or not if yes then return true otherwise return false;
        // == => compares address only so use equals
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name2 == name);
        /*
        its returning false why?? because name == name2 are comparing the string pool instead of characters
        it's not comparing the actual string characters/values its comparing the reference of both string == be like is both
        string referencing the same string?? if not then return false because a = "Rajeev" and b = "Rajeev" here not two "Rajeev"
        are created only one Rajeev is Created first time and b is referencing them and == compares that references so in java to
        compare two string we use Equals() method to compare two string equals methods compare actual string characters so use should
        use Equals() method to compare two string in java

         */

        System.out.println(name.equals(name2));

        System.out.println(name.equals(name3));
        System.out.println(name.equals(name2));
        System.out.println(name.compareTo(name3));
    }
}
