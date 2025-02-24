package wk5.reviewa;

import java.util.Scanner;

public class LongQuestion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String target;
        System.out.println("Enter a word");
        System.out.println("Enter a target letter");

        word = scan.nextLine();
        target = scan.nextLine(); //assume single letter
        int index = -1;
        for(int i =0; i<word.length() && index == -1; i++){
            if(index == -1 && word.charAt(i) == target.charAt(0)){
                index = i;
                i = word.length();
            }
        }
    }
}
