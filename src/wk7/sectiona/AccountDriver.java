package wk7.sectiona;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        AccountCreator ac = new AccountCreator();
        Scanner scan = new Scanner(System.in);
        String input;
        do{
            System.out.println("Enter an username between "
                    +AccountCreator.MAX_LEN +" and "+AccountCreator.MIN_LEN);
            input = scan.next();
        } while (input.length() > AccountCreator.MIN_LEN
                && input.length() < AccountCreator.MAX_LEN);
    }
}
