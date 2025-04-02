package wk9.sectionb;

import java.util.Random;

public class ModifyingArrays {
    private static void printArray(int[] list){
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    private static int[] randArray(int numValues, int min, int max){
        //declare a return variable
        int[] ans = new int[numValues];
        Random random = new Random();
        //modify the return variable
        for(int i = 0; i<ans.length; i++){
            ans[i] = random.nextInt(min, max);
        }
        //return the return variable
        return ans;
    }
    private static int[] negate(int[] orig){
        //declare a return variable
        int[] ans = new int[orig.length];
        //modify the variable
        for(int i = 0; i<orig.length; i++){
            ans[i] = orig[i] * -1;
        }
        //return the variable
        return ans;
    }
    public static void main(String[] args) {
        int[] nums;
        nums = new int[3];
        nums = randArray(3, 1, 10);
        printArray(nums);
        System.out.println("Original array");
        printArray(nums);
        int[] nums2 = negate(nums);
        System.out.println("Modified array");
        printArray(nums2);
    }
}
