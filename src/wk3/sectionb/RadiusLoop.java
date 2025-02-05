package wk3.sectionb;

import java.util.Scanner;

public class RadiusLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        do {
            System.out.println("Enter a positve value");
            r = scanner.nextInt();
        } while (r <= 0);
//        while (r <= 0) {
//            System.out.println("Enter a positve value");
//            r = scanner.nextInt();
//        }
        double c = r * r * 3.14;
        System.out.println("circumference "+c);

        System.out.println("goodbye");
    }
}
