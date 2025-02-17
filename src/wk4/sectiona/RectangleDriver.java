package wk4.sectiona;

import java.util.Scanner;

public class RectangleDriver {
    public static void temp(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        Rectangle r1;
        Rectangle r2;

        r1 = new Rectangle();
        r2 = new Rectangle();

        r2.setValues(9, 42);
        r1.setValues(4);

        r1.printValues();
        r2.printValues();

        System.out.println("Area of r1");
        System.out.println(r1.area());
        System.out.println("Area of r2");
        System.out.println(r2.area());

        System.out.println("Is r1 bigger than r2 " + r1.biggerThan(r2));
        System.out.println("Is r2 bigger than r1 " + r2.biggerThan(r1));

    }
}
