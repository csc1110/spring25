package wk8.sectiona;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //int[] nums = {1,2,3};
//        double[] nums = new double[3];
//        nums[0] = 3.14;
//        nums[1] = 1;
//        nums[2] = -0.99;
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = 10 * Math.random();
//        }
//        for(int i = 0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        Create an array of size 5 of ints
//        Ask the user to enter a number 5 times and store in the array
//        After they have entered all the values in the array
//        Iterate over the array and find the sum and then print out the mean value
//        Iterate over the array and find the min and max

        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Enter a number");
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum/(double)nums.length);

        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);





    }
}
