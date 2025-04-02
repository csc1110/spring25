package wk9.sectiona;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        String[] words1 = new String[3];

        ArrayList<String> words2 = new ArrayList();

        System.out.println("Length of the array is ");
        System.out.println(words1.length);

        System.out.println("Length of the ArrayList is ");
        System.out.println(words2.size());

        words2.add("foo");
        words2.add("bar");
        words2.add("taco");

        System.out.println("Length of the ArrayList after ");
        System.out.println(words2.size());

        int numElements = 0;
        words1[0] = "foo";
        numElements++;
        words1[1] = "bar";
        numElements++;

        for(int i = 0; i<numElements; i++){
            System.out.print(words1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i<words2.size(); i++){
            System.out.print(words2.get(i) + " ");
        }
        System.out.println();

        words2.set(0, "hello");
        words2.set(words2.size() - 1, "world");

        System.out.println(words1);
        System.out.println(words2);
        words2.add("desk");
        words2.add("weather");

        //words1[4] = "house";
        words2.add("yes");
        words2.set(5, "bad");
        System.out.println(words2);

    }
}
