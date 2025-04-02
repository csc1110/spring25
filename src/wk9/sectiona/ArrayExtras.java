package wk9.sectiona;

public class ArrayExtras {
    public static void main(String[] args) {
//        int[] nums = {10,4,5,-1,20};
//        System.out.println("traditional for loop");
//        for(int i = 0; i<nums.length && i > 0; i++){
//            System.out.println(nums[i]);
//            System.out.println(Math.pow(nums[i],2));
//        }
//        System.out.println("for each");
//        for(int num: nums){
//            System.out.println(num);
//            System.out.println(Math.pow(num,2));
//        }
//        String[] words = {"foo", "bar", "taco", "cat"};
//        for(String s: words){
//            System.out.println(s.toUpperCase());
//        }

        int[] nums = new int[5];
        int[][] mat = new int[5][5];

        //mat[1][1] = (int)(Math.random() * 10);
        int numValues = 5;
        for(int i = 0; i<numValues; i++){
            int x = (int)(Math.random() * 5);
            int y = (int)(Math.random() * 5);
            mat[x][y]= 1;
        }
        //mat[1][3] = 1;
        //mat[2][2] = 1;

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }


    }
}
