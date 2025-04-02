package wk9.sectiona;

import java.util.ArrayList;

public class ArrayListTypes {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        //ArrayList<int> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            nums2.add((int)Math.pow(i, 2));
        }

        int[] nums3 = new int[3];
        Integer[] nums4 = new Integer[3];
        nums4[0] = 42;

        ArrayList<Double> nums5 = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Boolean> flags = new ArrayList<>();

    }
}
