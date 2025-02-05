package wk3.sectiona;

import java.util.Scanner;

public class LoopRadiusExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rad;
        do {
            System.out.println("Enter a positive value");
            rad = scanner.nextInt();
        } while (rad <= 0);
//        while(rad <= 0){
//            System.out.println("Enter a positive value");
//            rad = scanner.nextInt();
//        }

        double c = rad * rad * 3.14;
        System.out.println("circumference is "+c);





        System.out.println("Goodbye");
    }
}
