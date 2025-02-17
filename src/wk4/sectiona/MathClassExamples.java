package wk4.sectiona;

public class MathClassExamples {
    public static void main(String[] args) {
//        double num1 = -2.5;
//        double num2 = 2.5;
//
//
//        System.out.println("Abs value of "+num1+" is "+Math.abs(num1));
//        System.out.println("sqrt value of "+num1+" is "+Math.sqrt(Math.abs(num1)));
//
//        System.out.println("Max value of "+Math.max(num1, num2));
//        System.out.println("Min value of "+Math.min(num1, num2));
//        System.out.println("2 raised to the 3 "+Math.pow(2, 3));
//        System.out.println("10 raised to the 3 "+Math.pow(10, 3));
//
//        //rounding operations
//        double num3 = 1.5;
//        double num4= 1.45;
//        System.out.println("Standard rounding "+Math.round(num3));
//        System.out.println("Standard rounding "+Math.round(num4));
//
//        System.out.println("Force round up "+Math.ceil(num4));
//        System.out.println("Force round down "+Math.floor(num3));

//        for(int i = 0; i<10; i++){
//            System.out.println("Random number from 1 up to 6 "+(int) (6 * Math.random() + 1));
//        }


        System.out.println("PI is "+Math.PI);
        System.out.println("E is "+Math.E);

        double d = 180;
        double r = 3.14;

        System.out.println(d +" degress to radiuans "+Math.toRadians(d));
        System.out.println(r +" radiuans to degrees "+Math.toDegrees(r));

        double sidea = 5;
        double sideb = 5;
        System.out.println("The angle of the triangle is "+Math.toDegrees(Math.atan(sidea/sideb)));



    }
}
