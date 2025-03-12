package wk8.sectionb;

import java.util.Scanner;

public class Practice3 {

    //create a mehtod called getAverage that takes in
    //an array of ints and returns the average value
    private static double getAverage(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum / (double) nums.length;
    }


    //create a method call setValues that takes in an
    //int for the szie and scanner. returns an
    //array of Strings of values gotten from the user
    public static String[] setValues(int size, Scanner scanner){
        String[] ans = new String[size];
        for(int i = 0; i<size; i++){
            ans[i] = scanner.next();
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
