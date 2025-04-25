package wk11.reviewa;

public class Square {
    private Point lowerLeft;
    private Point upperRight;

    public Square(Point lowerLeft, Point upperRight){
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
    }

    public Square(Point upperRight){
        //lowerLeft = new Point(0,0);
        //this.upperRight = upperRight;
        this(new Point(0,0), upperRight);
    }

    public int getSide(){
        return Math.abs(upperRight.getY() - lowerLeft.getY());
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }
    public Point getUpperRight() {
        return upperRight;
    }
}
