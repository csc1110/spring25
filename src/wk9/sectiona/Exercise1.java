package wk9.sectiona;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();

        //Double temp1 = -1.0;
        //Double temp2 = -1;

        for(int i = 0; i<10; i++){
            nums.add(Math.random() * 10 + 1);
        }
        System.out.println(nums.get(0) + nums.get(nums.size() - 1));

        double max = nums.get(0);
        int index = 0;
        for(int i = 1; i<nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
                index = i;
            }
        }
        nums.set(index, -1.0);

        max = nums.get(0);
        index = 0;
        int count = 1;
        for(double d: nums){
            if(nums.get(count) > max){
                max = nums.get(count);
                index = count;
            }
            count++;
        }

        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a word");
            words.add(scan.next());
        }
        boolean isSame;
        isSame = words.get(0).equals(words.get(words.size()/2));


    }
}
