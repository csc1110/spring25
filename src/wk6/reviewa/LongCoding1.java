package wk6.reviewa;

import java.util.Scanner;

public class LongCoding1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Enter the current time " +
                "in the form hh:mm:ss in military time " +
                        "(24 hour format).");

        String input = scan.nextLine();
        int h = Integer.parseInt(input.substring(0,2));
        if(h > 19){
            System.out.println("less than 5 hours");
        } else if(h>10){
            System.out.println("hours left is "+(24 - h));
        } else {
            System.out.println("less than 10 hours");
        }
        int hoursLeft = 24 - h;
        if(hoursLeft < 5){
            System.out.println("less than 5");
        } else if (hoursLeft < 10) {
            System.out.println("less than 10");
        } else {
            System.out.println(hoursLeft);
        }


    }
}
