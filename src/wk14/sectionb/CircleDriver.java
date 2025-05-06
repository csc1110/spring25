package wk14.sectionb;

import wk14.sectiona.InvalidRadiusException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Circle c1 = getInput(scanner);
            System.out.println(c1.toString());
        } catch (InvalidRadiusExceptionChecked e){
            System.out.println("Bad radius");
        } catch (InputMismatchException e){
            System.out.println("Non double input");
        }
    }
    private static Circle getInput(Scanner in)
    throws InvalidRadiusExceptionChecked {
        System.out.println("Enter a radius");
        double radius = in.nextDouble();
        return makeCircle(radius);

//        boolean validInput = false;
//        Circle ret = null;
//        do {
//            System.out.println("Enter a radius");
//            try {
//                double radius = in.nextDouble();
//                ret = makeCircle(radius);
//                validInput = true;
//            } catch (InvalidRadiusExceptionChecked e){
//                System.out.println("Bad radius");
//            } catch (InputMismatchException e){
//                System.out.println("Non double input");
//            }
//        } while (!validInput);
//        return ret;
    }
    private static Circle makeCircle(double radius)
            throws InvalidRadiusExceptionChecked{
        return new Circle(radius);
    }
}
