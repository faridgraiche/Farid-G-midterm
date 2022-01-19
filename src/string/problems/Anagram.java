package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".



        String a = "army";
        String b = "mary";

        if (a.length()!=b.length()){
            System.out.println("length is different thought are not anagram");
        }
        else
        {
            char[] char1 = a.toCharArray();
            char[] char2 = b.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);

            if (Arrays.equals(char1,char2)){
                System.out.println("the strings are anagram");
            }
            else{
                System.out.println("the strings are not anagrams");
            }
        }
    }
}
