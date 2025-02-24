package wk6.reviewb;

import java.util.Scanner;

public class LongCoding3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        word = scan.next();

        String first = word.substring(0, word.length()/2);
        String second = word.substring(word.length()/2);

        String result = second + first;
        System.out.println(result);


    }
}
