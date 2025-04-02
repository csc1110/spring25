package wk9.sectionb;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethods {

    //called randArrayList that takes in a
    //size and a min and max value, and returns
    //an ArrayList of Integers
    private static ArrayList<Integer> randArrayList(int size, int min, int max){
        //declare our return variable
        ArrayList<Integer> ans = new ArrayList<>();
        Random random = new Random();
        //modify our variable
        for(int i = 0; i<size; i++){
            ans.add(random.nextInt(min, max));
        }
        //return the variable
        return ans;
    }
    //sumArrayList
    //takes in an arraylist of intergers and returns the sum of the values
    private static int sumArrayList(ArrayList<Integer> list){
        //declare return variable
        int sum = 0;
        //modify the sum
        //for(type v: array)
        for(Integer i: list){
            sum += i;
        }
        //return variable
        return sum;
    }
    public static void main(String[] args) {
        //size 5, min 1, max 10
        //call randArrayList
        ArrayList<Integer> result = randArrayList(5, 1, 10);
        System.out.println(result);
        int ans = sumArrayList(result);
        System.out.println(ans);
    }
}
