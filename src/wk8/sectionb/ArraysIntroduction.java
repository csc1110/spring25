package wk8.sectionb;

public class ArraysIntroduction {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[3];

        nums[0] = 42;
        nums[1] = -1;
        nums[2] = nums[0] * nums[1];

        System.out.println(nums[0]);
        System.out.println(Math.abs(nums[1]));
        int n = nums[2];
        System.out.println(n);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        String word = "Hello";
        System.out.println(word.charAt(0));
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }



    }
}
