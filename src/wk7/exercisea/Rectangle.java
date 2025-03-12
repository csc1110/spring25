package wk7.exercisea;

public class Rectangle {
    private final Point upperLeft;
    private final double width;
    private final double height;

    public Rectangle(double width,
                     double height,
                     double x,
                     double y){
        upperLeft = new Point(x,y);
        this.width = width;
        this.height = height;
    }
    private Point getLowerRightCorner(){
        double newX = upperLeft.getX() +
                width;
        double newY = upperLeft.getY() -
                height;
        return new Point(newX, newY);
    }
    public void display(){

    }

}
