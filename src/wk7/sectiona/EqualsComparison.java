package wk7.sectiona;

public class EqualsComparison {
    private static boolean compareRectangle(Rectangle rec1, Rectangle rec2){
        if(rec1.getWidth() == rec2.getWidth() &&
                rec1.getHeight() == rec2.getHeight() &&
                rec1.getId().equals(rec2.getId())){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x;
        x = 10;
        int y = 11;
        int z = x;

        System.out.println("Is "+x+" equal to "+z);
        System.out.println(x == z);
        System.out.println("Is "+x+" equal to "+y);
        System.out.println(x == y);

        Rectangle r1 = new Rectangle(3, 4, "foo");
        Rectangle r2 = new Rectangle(4, 4, "foo");
        Rectangle r3 = r1;

        System.out.println("Are r1 and r2 the same");
        System.out.println(r1 == r2);
        System.out.println("Are r1 and r3 the same");
        System.out.println(r1 == r3);

        if(compareRectangle(r1, r2)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
        if(compareRectangle(r2, r3)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        if(r2.equals(r1)){
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }



    }
}
