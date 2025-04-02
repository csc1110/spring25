package wk9.sectionb;

public class ArrayExtras {
    public static void main(String[] args) {
//        int[] nums = {5, 8, -1, 10};
//        //traditional for loop
//        for(int i = 0; i<nums.length; i++){
//            System.out.print(nums[i] +" ");
//        }
//        System.out.println();
//
////        for(<type> <varName>: <collection>){
////
////        }
//        int sum = 0;
//        int evenCount = 0;
//        int index = -1;
//        for(int num: nums){
//            index++;
//            if(num % 2 == 0){
//                evenCount++;
//            }
//            //bad practice
//            if(num < 0){
//                break;
//            }
//            System.out.println(num);
//            System.out.println(Math.pow(num, 2));
//            sum += num;
//        }
//
//        String[] words = {"foo", "bar", "taco"};
//        for(String word: words){
//            System.out.println(word.toUpperCase());
//            String seen = "";
//            for(int i = 0; i<word.length(); i++){
//                if(seen.contains(String.valueOf(word.charAt(i)))){
//
//                }
//
//                seen += word.charAt(i);
//            }
//
//        }

        int[][] board = new int[3][3];

//        board[0][2] = (int)(Math.random() * 3);
//        int x = (int)(Math.random() * 3);
//        int y = (int)(Math.random() * 3);
//        board[y][x] = -1;
        board[0][2] = 1;
        board[1][0]= -1;

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }





    }
}
