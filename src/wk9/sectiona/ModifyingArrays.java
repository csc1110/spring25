package wk9.sectiona;

import java.util.Random;

public class ModifyingArrays {
    private static void printArray(int[] list){
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    private static int[] randArray(int numValues, int min, int max){
        //declare some return variable
        int[] ans = new int[numValues];
        Random random = new Random();
        //modify return variable
        for(int i = 0; i<ans.length; i++){
            ans[i] = random.nextInt(min, max);
        }
        //return the return variable
        return ans;
    }

    /**
     * Takes in an array of ints and then returns an
     * array with the values of the original multiplied by
     * -1.
     * @param orig
     * @return
     */
    private static int[] negate(int[] orig){
        int[] ans = new int[orig.length];
        for(int i = 0; i<orig.length; i++){
            ans[i] = orig[i] * -1;
        }
        return ans;
    }
    private static void negate2(int[] orig){
        for(int i = 0; i<orig.length; i++){
            orig[i] = orig[i] * -1;
        }
    }
    public static void main(String[] args) {
        int[] nums;
//        nums = randArray(5, 1, 10);
//        //nums = new int[5];
//        System.out.println("Original");
//        printArray(nums);

        nums = randArray(5,1,10);
        System.out.println("Original");
        printArray(nums);
        int[] nums2 = negate(nums);
        System.out.println("negated");
        printArray(nums2);
        System.out.println("original");
        printArray(nums);

        nums = randArray(5,1,10);
        System.out.println("Original");
        printArray(nums);
        negate2(nums);
        //System.out.println("negated");
        //printArray(nums2);
        System.out.println("original");
        printArray(nums);



    }

}
