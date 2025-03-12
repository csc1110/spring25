package wk7.sectionb;

public class Circle {
    private double radius;
    public static int count = 0;
    public Circle(double radius){
        this.radius = radius;
        count++;
    }
    public int getCount() {
        return count;
    }
}
