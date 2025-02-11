package wk4.sectiona;

import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = "1234";
        String guess;

         do{
            System.out.println("Enter your password or 'q' to quit");
             guess = scanner.next();

            if (pass.equals(guess)) {
                System.out.println("Access granted");
            }  else if (guess.equals("q")){
                System.out.println("Exiting");
             }else {
                System.out.println("Access denied");
            }
        } while(!pass.equals(guess) && !guess.equals("q"));
    }
}
