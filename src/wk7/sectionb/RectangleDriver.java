package wk7.sectionb;

public class RectangleDriver {
    public static void main(String[] args) {
        int x;
        x = 10;
        int y = 5;
        int z;
        z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        x = 42;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Rectangle r1;
        r1 = new Rectangle(3, 4, "blue");
        Rectangle r2 = new Rectangle(4, 5, "red");
        Rectangle r3;
        r3 = r1;

        System.out.println("r1 width");
        System.out.println(r1.getWidth()); //3
        System.out.println("r2 width");
        System.out.println(r2.getWidth()); //4
        System.out.println("r3 width");
        System.out.println(r3.getWidth()); //3 or 0

        r1.setWidth(42);

        System.out.println("r1 width");
        System.out.println(r1.getWidth()); //42
        System.out.println("r2 width");
        System.out.println(r2.getWidth()); //4
        System.out.println("r3 width");
        System.out.println(r3.getWidth()); //3 or 42


    }
}
