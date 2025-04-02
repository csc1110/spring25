package wk9.sectiona;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
//        Create an ArrayList of Strings
//        Check if it is empty with isEmpty()
//        Add the following values: “foo”, “bar”,”foo”,”taco”,”bar”,”cat”
//        Use indexOf() and lastIndexOf() to find the first and last index of “bar”
//        Remove the element at index 3 and remove the first “foo”

        ArrayList<String> words = new ArrayList<>();
        System.out.println(words.isEmpty());

        words.add("foo");
        words.add("bar");
        words.add("foo");
        words.add("taco");
        words.add("bar");
        words.add("cat");
        System.out.println("First index of bar is "+words.indexOf("bar"));
        System.out.println("Last index of bar is "+words.lastIndexOf("bar"));

        System.out.println(words);

        words.remove(3);
        words.remove("foo");

        System.out.println(words);


    }
}
