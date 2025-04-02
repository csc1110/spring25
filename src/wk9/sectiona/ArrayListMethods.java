package wk9.sectiona;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        //get(), add(), set(), size()
        ArrayList<String> words = new ArrayList<>();
        System.out.println(words.isEmpty());
        words.add("foo");
        words.add("bar");
        words.add("taco");
        words.add("bar");
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println("first occurrence of bar "+words.indexOf("bar"));
        System.out.println("last occurrence of bar "+words.lastIndexOf("bar"));
        System.out.println("first occurrence of cat "+words.indexOf("cat"));

        System.out.println("Before removal");
        System.out.println(words);

        System.out.println("Removing bar");
        words.remove("bar");
        System.out.println(words.size());
        System.out.println(words);

        words.remove(1);
        System.out.println(words.size());
        System.out.println(words);

        words.remove(words.indexOf("foo"));
        System.out.println(words);

        words.remove(0);
        System.out.println(words);
        System.out.println(words.isEmpty());



    }
}
