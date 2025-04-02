package wk9.sectionb;

import java.util.ArrayList;

public class ArrayListOtherMethods {
    public static void main(String[] args) {
        //get(), set(), add(), size()
        ArrayList<String> words =
                new ArrayList<>();

        System.out.println("Is arraylist empty before " +
                words.isEmpty());
        words.add("foo");
        words.add("bar");
        words.add("taco");
        words.add("bar");
        System.out.println("Is arraylist empty  after " +
                words.isEmpty());

        System.out.println(words);
        System.out.println("Index of first bar is "+
                words.indexOf("bar"));
        System.out.println("Last index of first bar is "+
                words.lastIndexOf("bar"));
        System.out.println("Last index of first cat is "+
                words.indexOf("cat"));

        System.out.println("Is bar is the list "+words.contains("bar"));
        System.out.println("Is cat is the list "+words.contains("cat"));

        System.out.println("before");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println("Removing the first bar");
        words.remove("bar");
//        System.out.println("Removing element at index 2 ");
//        words.remove(2);
        System.out.println("after");
        System.out.println(words);
        System.out.println(words.size());



    }
}
