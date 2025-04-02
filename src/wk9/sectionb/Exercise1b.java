package wk9.sectionb;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1b {
    public static void main(String[] args) {
//        Create an ArrayList of Strings
//        Add 5 Strings from the user

//        In a separate loop, iterate over the ArrayList and find the index of all Strings with an ‘a’
//        Store the indices in another ArrayList
//        Replace the Strings that have an ‘a’ with “hello”

        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Enter a word");
            words.add(scan.next());
        }
//        See if the first and middle Strings are the same
        boolean isSame;
        if(words.get(0).equals(words.get(words.size()/2))){
            isSame = true;
        } else {
            isSame = false;
        }
        String last = "velez";
        last.contains("a");
        ArrayList<Integer> indices = new ArrayList<>();
        //In a separate loop, iterate over the ArrayList
        //and find the index of all Strings with an ‘a’
        for(int i = 0; i<words.size(); i++){
            if(words.get(i).contains("a")){
                indices.add(i);
            }
        }
        System.out.println(indices);

    }
}
