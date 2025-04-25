package wk13.prep;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.println("Enter how many shapes to you want to add");
        try {
            int numShapes = scanner.nextInt();
            if(numShapes < 0){
                throw new IllegalArgumentException("number of shapes must be positive");
            }
            for (int i = 0; i < numShapes; i++) {
                System.out.println("Enter the type and value as type:value");
                String input = scanner.nextLine();
                try {
                    String[] tokens = input.split(":");
                    shapeList.add(makeShape(tokens[0], Double.parseDouble(tokens[1])));
//                if (tokens[0].equals("1")) {
//                    shapeList.add(new Circle(Double.parseDouble(tokens[1])));
//                } else if (tokens[1].equals("2")) {
//                    shapeList.add(new Square(Double.parseDouble(tokens[1])));
//                }
                } catch (NumberFormatException e){

                } catch (ArrayIndexOutOfBoundsException e){

                } catch (IllegalArgumentException e){

                }
            }
            System.out.println(shapeList);
        } catch (InputMismatchException e){

        } catch (IllegalArgumentException e){

        }
    }

    /**
     *
     * @param type
     * @param value
     * @throws IllegalArgumentException
     * @return
     */
    private static Shape makeShape(String type, double value)
            throws IllegalArgumentException {
        if(type.equals("1")){
            return makeCircle(value);
        } else if(type.equals("2")){
            return makeSquare(value);
        } else {
            throw new IllegalArgumentException();
        }
    }
    private static Circle makeCircle(double value){
        return new Circle(value);
    }
    private static Square makeSquare(double value){
        return new Square(value);
    }
}
