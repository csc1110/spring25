package wk7.sectiona;

public class CircleDriver {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, "c1");
        Circle c2 = new Circle(3, "c1");
        Circle c3 = new Circle(3, "c1");

        System.out.println(c1.getCount());
        System.out.println(c2.getCount());
        System.out.println(c3.getCount());

        System.out.println(Circle.count);
    }
}
