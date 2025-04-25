package wk12.seciona;

public class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        Shape s1 = r1;
        s1.area();
        s1.isSame(r1);

        Polygon p1 = r1;
        p1.numSides();

    }
}
