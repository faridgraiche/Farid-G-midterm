package string.problems;


import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Set<String> dup = new HashSet<String>();
        Set<String> set = new HashSet<String>();

        String[] words = st.split(" ");
        for (String word: words){
            boolean isAdded = set.add(word);
            if (!isAdded){
                dup.add(word);
            }
        }
        System.out.println(dup);


    }

}
