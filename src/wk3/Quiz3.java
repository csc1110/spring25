package wk3;

import java.util.Scanner;
public class Quiz3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You woke up at 06:00 in the morning.");
        System.out.println("Enter the current time in the format hh:mm.");
        System.out.println("Use military time (i.e. 24 hour) for the hour.");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int hours = Integer.parseInt(input.substring(0, 2)) - 6;
        int min = Integer.parseInt(input.substring(3));
        System.out.println("You have been up "+hours+ " hours and "+min+" minutes.");
        //Your code here

    }
}
