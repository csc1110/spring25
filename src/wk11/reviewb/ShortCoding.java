package wk11.reviewb;

import java.util.ArrayList;

public class ShortCoding {
    public static int count(ArrayList<String> words, String target){
        int count = 0;
        //for(<type> <var>: <list>)
        for(String s: words){
            if(s.equals(target)){
                count++;
            }
        }
        return count;
    }

    public static void replace(ArrayList<Integer> list, int t, int r) {
        //int index = list.indexOf(t);
        while(list.indexOf(t) != -1){
            list.set(list.indexOf(t), r);
        }

    }

    public static ArrayList<Integer> evenList(int min, int max, int num) {
        ArrayList<Integer> evenList = new ArrayList<>();
//        for(int i = num ; i>= 0; i--){
//            if(min % 2 == 0 && max % 2 == 0){
//
//            }
//        }
        for(int i = min; i <= max && evenList.size() < num; i++){
            if(i % 2 == 0){
                evenList.add(i);
            }
        }
        return evenList;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};


    }
    private static int[] makePalindrome(int[] nums){
        int[] ans = new int[nums.length * 2];

        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        int count = nums.length - 1;
        for(int i = nums.length; i < ans.length; i++){
            ans[i] = nums[count];
            count--;
        }
        return ans;
    }




}
