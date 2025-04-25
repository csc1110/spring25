package wk13.sectionb;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionExamples2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many shapes?");
        try {
            int numShapes = scanner.nextInt();
            if(numShapes < 0){
                throw new IllegalArgumentException("Entered num was "+
                        numShapes);

            }
            for (int i = 0; i < numShapes; i++) {
                System.out.println("Shape number "+i);
                System.out.println("Enter the type and value in" +
                        "the form of type:value ");
                String input = scanner.next();
                //["1", "4"] = "1:4.split(":")
                String[] tokens =
                        input.split(":");
                try {
                    if (tokens[0].equals("1")) {
                        shapes.add(new Square(Double.parseDouble(tokens[1])));
                    } else if (tokens[0].equals("2")) {
                        shapes.add(new Circle(Double.parseDouble(tokens[1])));
                    } else {
                        throw new IllegalArgumentException("Error invalid type " + tokens[0]);
                    }
                } catch (IllegalArgumentException e){
                    System.out.println("Bad type");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Error, number " +
                    "of shapes must be whole number ");
        } catch (IllegalArgumentException e){
            System.out.println("Error, number of shapes" +
                    "must be positive");
            System.out.println(e.getMessage());
        }
        System.out.println(shapes);
    }
}
