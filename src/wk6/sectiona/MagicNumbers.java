package wk6.sectiona;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass;
        System.out.println("Enter the mass of the falling object");
        mass = scan.nextDouble();
        System.out.println("The force on the falling object is "+ 9.81 * mass);
    }
}
