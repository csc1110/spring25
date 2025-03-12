package wk8.sectiona;

import java.util.Scanner;

public class ArrayMotivation {
    public static void main(String[] args) {
        //ask the user for three numbers and
        //print back the average
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number");
        int num2 = scanner.nextInt();
        System.out.println("Enter a number");
        int num3 = scanner.nextInt();

        double avg = (num1 + num2 + num3)/3.0;
    }
}
