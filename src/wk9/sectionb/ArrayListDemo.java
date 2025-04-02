package wk9.sectionb;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] words1;
        words1 = new String[3];
        //diff b/t length and # of elements
        System.out.println(words1.length);

        ArrayList<String> words2;
        words2 = new ArrayList();
        System.out.println(words2.size());
        int numElements = 0;
        words1[0] = "foo";
        numElements++;
        words1[1] = "bar";
        numElements++;

        words2.add("foo");
        System.out.println(words2.size());
        words2.add("bar");
        words2.add("taco");
        System.out.println(words2.size());

        words2.set(0, "hello");
        words2.add("table");
        words2.set(3, "world");

        System.out.println(words2.get(0));
        System.out.println(words1[0]);

        for(int i = 0; i<numElements; i++){
            System.out.print(words1[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<words2.size();i++){
            System.out.print(words2.get(i)+" ");
        }
        System.out.println();

        System.out.println(words1);
        System.out.println(words2);






    }
}
