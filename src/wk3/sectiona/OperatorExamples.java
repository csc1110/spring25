package wk3.sectiona;


import java.util.Scanner;

public class OperatorExamples {
    public static void main(String[] args){
        //Ask the user for the radius of a circle
        //And compute the circumfrence
        //System.out.println("Enter a number between 4 and 10");
        System.out.println("Enter a number greater than 4 and less than 10");
        Scanner scan = new Scanner(System.in);
        int radius;
        radius = scan.nextInt();
        int threshold = 0;
        int lower = 4;
        int upper = 10;

        if(!(radius < lower ||  radius > upper)) {
            double circumference;
            circumference = radius * 2 * 3.14;
            System.out.println("Circumference " + circumference);
        } else if(radius == threshold){
            System.out.println("Circumference "+0);
        } else {
            System.out.println("Bad input");
        }
        System.out.println("Radius was "+radius);



    }
}
