package wk3.sectiona;


import java.util.Scanner;

public class IfExamples {
    static int x = 10;
    private static void temp(){
        //int x = 10;
        System.out.println(x);

    }

    public static void main(String[] args){
        System.out.println(x);

        //Ask the user for the radius of a circle
        //And compute the circumfrence
        System.out.println("Enter a positive number");
        Scanner scan = new Scanner(System.in);
        int radius;
        radius = scan.nextInt();
        int threshold = 0;
        double circumference = 0;
        if(radius > threshold) {
            circumference = radius * 2 * 3.14;
            System.out.println("Circumference " + circumference);
        } else if(radius == threshold){
            System.out.println("Circumference "+0);
        } else {
            System.out.println("Bad input");
        }
        System.out.println(circumference);
        System.out.println("Radius was "+radius);



    }
}
