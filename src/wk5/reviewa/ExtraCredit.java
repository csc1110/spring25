package wk5.reviewa;

import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter a word.");
        word = scan.next();
        for(int i = 0; i<word.length(); i++){
            if(i % 2 == 0){
                System.out.println(word.charAt(i));
            }
        }

    }
}
