package wk6.reviewa;

import java.util.Scanner;

public class LongCoding3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Etner a word");
        word = scan.nextLine();
        String first = word.substring(0, word.length()/2);
        String second = word.substring(word.length()/2);
        String result = first + second;
        System.out.println(result);

    }
}
