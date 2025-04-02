package wk9.sectionb;

import java.util.ArrayList;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
//        Create an ArrayList of doubles
//        Add 10 random numbers from 1 to 10 inclusive
//        Print the sum of the first and last numbers
//        In a separate loop, iterate over the ArrayList and find the index of the largest number
//        Replace (overwrite) the largest number with a -1

        ArrayList<Double> nums = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i<100; i++){
            nums.add(1 + rand.nextDouble(9));
        }
        System.out.println(nums.get(0) + nums.get(nums.size() - 1));
        double maxValue = nums.get(0);
        int maxIndex = 0;
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) > maxValue){
                maxValue = nums.get(i);
                maxIndex = i;
            }
        }
        nums.set(maxIndex, -1.0);




    }
}
