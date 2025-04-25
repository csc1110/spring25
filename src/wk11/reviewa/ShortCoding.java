package wk11.reviewa;

import java.util.ArrayList;

public class ShortCoding {

    public static int count(ArrayList<String> words, String target){
        int num = 0;
        for(String word: words){
            if(word.equals(target)){
                num++;
            }
        }
        return num;
    }
    private static void replace(ArrayList<Integer> list, int t, int r) {
        //ArrayList<String> ret = new ArrayList<>();
        while(list.indexOf(t) != -1){
            list.set(list.indexOf(t), r);
        }
    }


    public static ArrayList<Integer> evenList(int min, int max, int num) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(i %2 == 0 && ans.size() < num){
                ans.add(i);
            }
        }
        return ans;
    }
    public static int[] makePalindrome(int[] list){
        int[] ret = new int[list.length * 2];

        for(int i = 0; i<list.length; i++){
            ret[i] = list[i];
        }

//        for(int i = 0; i<list.length; i++){
//            ret[i + list.length] = list[list.length - i - 1];
//        }

        for(int i = list.length - 1; i>=0; i--){
            ret[(list.length * 2) - i] = list[i];
        }

        return ret;
    }


        public static void main(String[] args) {

    }
}
