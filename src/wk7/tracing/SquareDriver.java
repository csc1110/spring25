/*
 * Course:
 * Term
 * Assignment Name
 * Name:
 * Created: 9/25/2023
 */
package wk7.tracing;

public class SquareDriver {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square();

        s1.setSide(3);
        s1.setID("s1");
        s2.setSide(5);
        s2.setID("s2");

        s1.disp();
        s2.disp();

        boolean isSmaller = s1.smallerThan(s2);

        if(isSmaller){
            System.out.println("s1 is smaller than s2");
        } else{
            System.out.println("s2 is smaller than s1");
        }

    }
}
