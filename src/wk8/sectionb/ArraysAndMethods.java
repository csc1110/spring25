package wk8.sectionb;

import java.util.Random;

public class ArraysAndMethods {




    private static int[] randomArray(int size, int min, int max){
        //create/intialize your return variable
        int[] ans;
        ans = new int[size];
        Random random = new Random();
        //manipulate are variable
        for(int i = 0; i < ans.length; i++){
            ans[i] = random.nextInt(min, max + 1);
        }
        //return the variable
        return ans;
    }
    private static void printArray(int[] list){
        //print the contents of the array
        System.out.print("[");
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.print("]");
        System.out.println();

    }
    public static void main(String[] args) {
        int[] nums;
        nums = randomArray(3, 5, 10);
        printArray(nums);
//
//        printArray(nums);
//        nums[0] = Math.abs(nums[1]);
//        printArray(nums);
//        nums[2] = 42;
//        printArray(nums);
    }
}
