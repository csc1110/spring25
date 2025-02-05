package wk3.sectionb;

public class ForLoopPrinting {
    public static void main(String[] args) {
        String msg = "Hello";
//        System.out.println(msg.charAt(0));
//        System.out.println(msg.charAt(1));
//        System.out.println(msg.charAt(2));
//        System.out.println(msg.charAt(3));
//        System.out.println(msg.charAt(4));

        for(int i = msg.length() - 1; i >=0;i--){
            System.out.println(msg.charAt(i));
            System.out.println(Character.isLowerCase(msg.charAt(i)));
        }
    }
}
