package wk3.sectionb;


import java.util.Scanner;

public class IfExamples {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter a number between 4 and 10.");
        //System.out.println("Enter a number less than 4 or greater than 10.");
        int radius;
        radius = scanner.nextInt();
        //boolean value = radius > 0;
        int threshold = 0;

        if(!(radius < 4 || radius > 10 || radius % 2 == 0)){
            double cir = 0;
            cir = 2 * radius * 3.14;
            System.out.println("Circumference is " + cir);
        } else if(radius == 0){
            System.out.println("Circumference is 0");
        } else {
            System.out.println("Radius is invalid  "+radius);
        }
        //System.out.println("Circumference is "+cir);
        System.out.println("Radius is "+radius);
    }
}
