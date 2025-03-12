package wk7.sectiona;

public class Circle {
    private double radius;
    private String id;
    public static int count = 0;
    public Circle(double radius, String id) {
        this.radius = radius;
        this.id = id;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
