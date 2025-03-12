package wk7.exerciseb;

import java.util.Scanner;

public class RectangleDriver {

    private static Rectangle makeRectangle(Scanner scan){
        System.out.println("Enter the width");
        double width = scan.nextDouble();
        System.out.println("Enter the height");
        double height = scan.nextDouble();
        System.out.println("Enter the x");
        double x = scan.nextDouble();
        System.out.println("Enter the y");
        double y = scan.nextDouble();
        return new Rectangle(width, height, x, y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle r1 = makeRectangle(scan);
        // use the display() method of the
        // Rectangle that was just made
        r1.display();
    }
}
