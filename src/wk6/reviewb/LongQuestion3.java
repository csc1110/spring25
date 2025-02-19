package wk6.reviewb;

import java.util.Scanner;

public class LongQuestion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String target;
        System.out.println("Enter a word");
        System.out.println("Enter a target letter");

        word = scan.nextLine();
        target = scan.nextLine();

        int index = -1;

        for(int i = 0; i<word.length() && index == -1; i++){
            if(word.charAt(i) == target.charAt(0)){
                index = i;
            }

//            if(word.substring(i, i+1).equals(target)){
//                index = i;
//            }
        }
        System.out.println(index);
    }
}
