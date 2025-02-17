package wk4.sectionb;

public class ScopeReview {
    private static int value = 10;
    public static void main(String[] args) {
        System.out.println(value);
        int value = 42;
        System.out.println(value);

        //System.out.println(d);

        //temp(42);
        //System.out.println(c);
        //System.out.println(d);
        //System.out.println(value);

//        int x = 10;
////
//        if(true){
//            System.out.println(x);
//            int y = 5;
//        }
//        System.out.println(y);
//
//        while(x < 20){
//            System.out.println(x);
//            x++;
//            if(x == 0){
//                System.out.println(x);
//                int z = 5;
//            }
//            int r = 10;
//            System.out.println(z);
//        }
//        System.out.println(r);

    }
    public static void temp(int c){
        int d = 5;
        System.out.println(c);
        System.out.println(value);
    }

}
