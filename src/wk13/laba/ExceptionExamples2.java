package wk13.laba;

import wk13.sectionb.Person;

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
            if(numShapes <= 0){
                throw new IllegalArgumentException("Negative number "+numShapes);
            }
            for (int i = 0; i < numShapes; i++) {
                System.out.println("Shape number " + i);
                System.out.println("Enter the type and value in" +
                        "the form of type:value ");
                String input = scanner.next();
                //["1", "4"] = "1:4".split(":")

                String[] tokens = input.split(":");
                //makeShape may result in ArrayIndexOutOfBounds
                try {
                    shapes.add(makeShape(tokens));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid type");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Invalid user input");
                }
            }
            System.out.println(shapes);
        } catch (InputMismatchException e){
            System.out.println("Error, number of shapes must be" +
                    "a whole number.");
        } catch (IllegalArgumentException e){
            System.out.println("Error, number of shapes must be"+
                    " positive.");
            System.out.println(e.getMessage());

        }

    }

    /**
     *
     * @param tokens
     * @throws IllegalArgumentException if the shape type not 1 or 2
     * @return
     */
    private static Shape makeShape(String[] tokens){
        if (tokens[0].equals("1")) {
            return makeCircle(tokens[1]);
        } else if (tokens[0].equals("2")) {
            return makeSquare(tokens[1]);
        } else {
            throw new IllegalArgumentException("Invalid type "+tokens[0]);
        }
    }
    private static Circle makeCircle(String value){
        double radius = Double.parseDouble(value);
        return new Circle(radius);

    }
    private static Square makeSquare(String value){
        double side = Double.parseDouble(value);
        return new Square(side);
    }
}
