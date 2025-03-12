package wk8.sectionb;

import java.util.Scanner;

public class ArrayMotivation {
    public static void main(String[] args) {
        // ask the user for 3 numbers
        // and then calculate the avg

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("Enter number 3");
        int num3 = scanner.nextInt();

        double avg = (num1 + num2 + num3) / 3.0;



    }
}
