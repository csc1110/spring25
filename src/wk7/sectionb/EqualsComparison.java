package wk7.sectionb;

public class EqualsComparison {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 10;

        System.out.println("x and y are the same");
        System.out.println(x == y);
        System.out.println("x and z are the same");
        System.out.println(x == z);

        Rectangle r1;
        r1 = new Rectangle(3, 4, "blue");
        Rectangle r2 = new Rectangle(3, 4, "blue");
        Rectangle r3;
        r3 = r1;

        System.out.println("Are r1 and r2 the same");
        System.out.println(r1 == r2);
        System.out.println("Are r1 and r3 the same");
        System.out.println(r1 == r3);

        if(r1.getWidth() == r2.getWidth() &&
        r1.getHeight() == r2.getHeight() &&
        r1.getColor().equals(r2.getColor())){
            System.out.println("Same");
        } else{
            System.out.println("Not same");
        }

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

    }
}
