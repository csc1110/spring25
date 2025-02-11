package wk4.sectionb;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {


        System.out.println("enter an int");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input");
            System.out.println("Try again");
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        System.out.println("Value is "+value);
    }
}
