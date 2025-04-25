package wk13.sectiona;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample2 {
    public static void main(String[] args) {
        Shape s1 = new Square(-3);
        System.out.println(s1.area());

        List<Shape> shapeList = new ArrayList<>();
    }
    private Shape makeShape(int type, int side1, int side2){
        if(type == 0){
            return createRectangle(side1, side2);
        } else if(type == 1){
            return createSquare(side1);
        } else {
            throw new IllegalArgumentException("Invalid type: "+type);
        }
    }
    private Rectangle createRectangle(int width, int height){
        return new Rectangle(width, height);
    }
    private Square createSquare(int side){
        return new Square(side);
    }
}
