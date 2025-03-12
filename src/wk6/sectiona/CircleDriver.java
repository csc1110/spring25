package wk6.sectiona;

public class CircleDriver {
    public static void main(String[] args) {
        Circle c1 =
                new Circle(6, "blue");

        System.out.println(c1.getArea());
        System.out.println(c1.getColor());

        System.out.println(c1.display());
    }
}
