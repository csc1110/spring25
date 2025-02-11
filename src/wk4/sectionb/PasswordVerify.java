package wk4.sectionb;

import java.util.Scanner;

public class PasswordVerify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = "1234";
        String guess;
        do{
            System.out.println("Enter your password or 'q' to quit.");
            guess = scanner.next();
            if (guess.equals(pass)) {
                System.out.println("Access granted");
            } else if(guess.equals("q")){
                System.out.println("Exiting");
            } else {
                System.out.println("Access denied");
            }
        } while(!guess.equals(pass) && !guess.equals("q"));
    //} while(!(guess.equals(pass) || guess.equals("q")));
    }
}
