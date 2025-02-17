/*
 * Course: CSC-1110 - FIXME
 * Fall 2023
 * Exercise 4 - Right Triangle Math
 * Name: FIXME
 * Last Updated: FIXME
 */

package wk4.exercise;

import java.util.Scanner;

/**
 * This class generates two random whole numbers between 1 and 10 and
 * uses those values as the two legs of a right triangle. It then
 * calculates the hypotenuse and the remaining two angles and
 * displays them.
 */
public class Exercise4 {
    private static final double RIGHT_ANGLE = 90.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean going = true;
        String input;
        do {
            // randomly choose side a
            double a = generateSide();
            // randomly choose side b
            double b = generateSide();
            // calculate hypotenuse
            double h = calculateHypotenuse(a, b);
            // calculate angle ah
            double angleAH = calculateAngle(a, h);
            // calculate angle bh
            double angleBH = RIGHT_ANGLE - angleAH;
            // report using printf
            report(a, b, h, angleAH, angleBH);
            System.out.println("What you like to go again (y/n)");
            input = scanner.nextLine();
            if(!input.equalsIgnoreCase("y")){
                going = false;
            }
        } while (!input.equals("y"));

    }

    private static int generateSide() {
        //TODO
        return (int)(10 * Math.random() + 1);

    }

    private static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        // TODO
    }

    private static double calculateAngle(double x, double h) {
        // TODO
        return 0;
    }

    private static void report(double a, double b, double h, double angleAH, double angleBH) {
        // TODO
    }
}