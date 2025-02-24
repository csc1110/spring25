package wk6.reviewb;

import java.util.Scanner;

public class LongCoding1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter the current time " +
                "in the form hh:mm:ss in military time " +
                        "(24 hour format).");

        word = scan.nextLine();
        int time = Integer.parseInt(word.substring(0, 2));
        int hoursLeft = 24 - time;
        if(hoursLeft < 10 && hoursLeft >= 5){
            System.out.println("10 hours left");
        } else if (hoursLeft < 5) {
            System.out.println("Less than 5");
        } else {
            System.out.println("There are "+ hoursLeft);
        }


    }
}
