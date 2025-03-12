package wk8.sectionb;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
//        double[] nums = new double[3];
//
//        nums[0] = Math.PI;
//        nums[1] = 0.5;
//        nums[2] = 10;
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//
////        nums[0] = Math.random();
////        nums[1] = Math.random();
////        nums[2] = Math.random();
//        for(int i = 0; i<nums.length; i++){
//            nums[i] = Math.random();
//        }
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            System.out.println("enter a whole number");
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Mean is " + sum / (double)nums.length);
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }

        }


    }
}
