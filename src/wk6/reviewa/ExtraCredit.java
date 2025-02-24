package wk6.reviewa;

import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num;
        num = scan.nextInt();
        int num2 = num;
        for(int i = num - 1; i>0;i--){
            num2 *= i;
        }
        System.out.println(num2);
        int ans = 1;
        for(int i = 1; i<=num;i++) {
            ans = ans * 1;
        }



    }
}
