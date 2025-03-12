package wk7.sectiona;

public class MemoryDriver {
    public static void main(String[] args) {
        int x;
        x = 10;
        int y = 11;
        int z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        x = 4;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Rectangle r1;
        r1 = new Rectangle(2, 3, "r1");
        Rectangle r2 = new Rectangle(4, 5, "r2");
        Rectangle r3 = r1; //What happens here?

        System.out.println("r1");
        r1.printValues();
        System.out.println("r2");
        r2.printValues();
        System.out.println("r3");
        r3.printValues();
        r1.setWidth(42);
        System.out.println("r1");
        r1.printValues();
        System.out.println("r2");
        r2.printValues();
        System.out.println("r3");
        r3.printValues();










    }
}
