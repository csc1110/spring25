package wk6.reviewb;

import java.util.Scanner;

public class LongCoding2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;


        String ans;
        do {
            System.out.println("Enter a non-negative value ");

            int num = scan.nextInt();
            if(num < 0){
                System.out.println("Invalid");
            } else {
                System.out.println(Math.sqrt(num));
            }
            System.out.println("Do you want to keep going (yes/no)");
            ans = scan.nextLine();
            if(ans.equals("no")){
                System.out.println("goodbaye");
            }
        } while(ans.equals("yes"));

    }
}
