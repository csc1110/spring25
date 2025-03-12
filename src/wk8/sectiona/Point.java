package wk8.sectiona;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double dist(Point other){
        double dist = Math.sqrt(Math.pow(this.x - other.getX(),2) +
                Math.pow(this.y - other.getY(),2));
        return dist;
    }
}
