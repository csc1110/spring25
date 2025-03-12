package wk7.exerciseb;

public class Rectangle {
    private final Point upperLeft;
    private final double width;
    private final double height;

    public Rectangle(double width,
                     double height,
                     double x,
                     double y){
        this.width = width;
        this.height = height;
        upperLeft = new Point(x, y);
    }
    public void display(){
        System.out.println("foo");
    }

    private Point getLowerRightCorner(){
        double newX = upperLeft.getX() +
                width;
        double newY = upperLeft.getY() -
                height;

        return new Point(newX, newY);
    }
}
