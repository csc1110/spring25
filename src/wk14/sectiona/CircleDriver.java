package wk14.sectiona;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CircleDriver {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = new FileInputStream("test.txt");
        try {
            Circle c1 = getInput(scanner);
            System.out.println(c1.toString());
        } catch (InvalidRadiusExceptionChecked e){
            System.out.println("Error with radius ");
            System.out.println(e.getMessage());
        }
    }
    private static Circle getInput(Scanner in)
            throws InvalidRadiusExceptionChecked {
        double radius = in.nextDouble();
        Circle ret = makeCircle(radius);
        return ret;
//        boolean validInput = false;
//        Circle ret = null;
//        do {
//            System.out.println("Enter the radius for a Circle");
//            double radius = in.nextDouble();
//            try{
//                ret = makeCircle(radius);
//                validInput = true;
//            } catch (InvalidRadiusExceptionChecked e){
//                System.out.println("Error with the radius");
//            }
//        } while (!validInput);
//        return ret;
    }
    private static Circle makeCircle(double radius)
            throws InvalidRadiusExceptionChecked{
        return new Circle(radius);
    }
}
