package stringbuilder;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/*
I have a given a string of lowercase letters amd need to print character which occurs maximum number of times
Hint : Only 26 characters we can  hash this
 */
public class OccuringCharcterMostNoOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(MostFrequentCharacter(s));
    }

    public static char MostFrequentCharacter(String s) {
        //frequency array a->0 , b->1 , c -> 2 , d->3
        int[] ch = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 97;
            ch[index]++;
//            ch[s.charAt(i) - 97]++;
        }
        System.out.println(Arrays.toString(ch));
        //this oop is for finding the maximum elements in the array
        int maxfr = 0;
        for (int i = 0; i < ch.length; i++) {
            maxfr = Math.max(maxfr , ch[i]);
        }

        //this loop is finding which character occurs most of the time
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == maxfr){
                return (char) ((char)i+97);
            }
        }
        return ' ';
    }
}
