package wk4.sectiona;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            //waiting
            System.out.println("Invalid input enter again");
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        System.out.println("Number is "+num);
    }
}
