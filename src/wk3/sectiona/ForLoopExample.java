package wk3.sectiona;

public class ForLoopExample {
    public static void main(String[] args) {
        String msg = "Hello World";

//        System.out.println(msg.charAt(0));
//        System.out.println(msg.charAt(1));
//        System.out.println(msg.charAt(2));
//        System.out.println(msg.charAt(3));
//        System.out.println(msg.charAt(4));

        for(int i = 0; i < msg.length(); i++){
            System.out.println(msg.charAt(i));
        }

    }
}
