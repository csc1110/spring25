package wk6.reviewa;

import java.util.Scanner;

public class LongQuestion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        do{
            System.out.println("Enter a num b/t 5 and 10 or -1 to quit");
            num = scan.nextInt();
//            if(num == -1){
//                System.out.println("quitting");
//            } else {

            if(num != -1){
                if (!(num >= 5 && num <= 10)) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("Correct");
                }
            }


        }while(!(num >= 5 && num <= 10 || num == -1));
        System.out.println("quitting");
    }
}
