package wk4.sectiona;

public class ScopeReview {
    private static int j = 5;

    public static void temp(int c){
        System.out.println(c);
        int i = 3;
        System.out.println(j);
        int j = 6;
        System.out.println(j);

    }
    public static void main(String[] args) {
        temp(42);
//        System.out.println(c);
//        System.out.println(i);
//        System.out.println(j);
//        int x = 4;
//
//        if(true){
//            System.out.println(x);
//            int y = 10;
//            System.out.println(j);
//        }
//        System.out.println(y);
//
//        while(x < 10){
//            x++;
//            int z = 5;
//        }
//        System.out.println(z);
//
//        {
//           int r = 0;
//            System.out.println(x);
//        }
//        System.out.println(r);
    }
}
