package wk11.reviewb;

public class Square {
    private Point lowerLeft;
    private Point upperRight;

    public Square(Point lowerLeft, Point upperRight){
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
    }
    public Square(Point upperRight){
        //Point test = new Point(0,0);
        this(new Point(0,0), upperRight);
    }
    public Point getLowerLeft() {
        return lowerLeft;
    }
    public Point getUpperRight() {
        return upperRight;
    }
    public int getSide(){
        return upperRight.getY() - lowerLeft.getY();
    }
}
