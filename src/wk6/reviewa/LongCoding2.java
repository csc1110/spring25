package wk6.reviewa;

import java.util.Scanner;

public class LongCoding2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;

        int num;
        String ans;
        do{
            System.out.println("Enter a non-neg number");
            num = scan.nextInt();
            if(num < 0){
                System.out.println("Invalid number");
            } else {
                System.out.println(Math.sqrt(num));
            }
            System.out.println("Enter yes to go again");
            ans = scan.next();

        }while(ans.equals("yes"));

    }
}
