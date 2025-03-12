package wk8.sectiona;

import java.util.Random;
import java.util.Scanner;

public class ArraysAndMethods {




    private static void printArray(String[] values){
        for(int i = 0; i<values.length; i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();
    }
    private static void printArray(int[] values){
        for(int i = 0; i<values.length; i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();
    }
    private static int[] randomArray(int num, int min, int max){
        //intialize our return variable
        int[] ans;
        ans = new int[num];
        //modify our return varible
        Random random = new Random();
        for(int i = 0; i<ans.length; i++){
            ans[i] = random.nextInt(min, max);
        }
        //return out return variable
        return ans;
    }
    public static void main(String[] args) {
        randomArray(3, 1, 10);
        //printArray(nums);


//        String[] words = {"foo", "bar", "taco"};
//        printArray(words);
//        words[0] = "cat";
//        words[2] = "hello";
//        printArray(words);
//        Scanner scanner = new Scanner(System.in);
//        words[1] = scanner.next();
//        printArray(words);
//
//        int[] nums = new int[10];
//        Random random = new Random();
//        for(int i = 0; i<nums.length; i++){
//           nums[i] = random.nextInt(1,10);
//        }




        //printArray(words);



    }
}
