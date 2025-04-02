package wk9.sectiona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PassingArrayLists {

    //takes in a size, min value, and max value
    //and returns a new arraylist of integers
    //filled with random numbers
    private static ArrayList<Integer> randArrayList(int size, int min, int max){
        //create our return variable
        ArrayList<Integer> ans = new ArrayList<>();
        //add/modify the list
        Random random = new Random();
        for(int i = 0; i<size; i++){
            ans.add(random.nextInt(min, max));
        }
        //return ans
        return ans;
    }
    //pass in an ArrayList of Integers, return the sum of the elements
    private static int sumArrayList(ArrayList<Integer> list){
        //declare return variable
        int sum = 0;

        //modify the variable
        //for(type varName: name of list)
        for(Integer num: list){
            sum += num;
        }

        //return the variable
        return sum;
    }
    public static void main(String[] args) {
        //call helper methods from main()
        //call randArray and print out the result?
        //size 5, min 1, max 10
        ArrayList<Integer> result = randArrayList(5, 1, 10);
        System.out.println(result);

        int sum = sumArrayList(result);
        System.out.println(sum);


    }
}
