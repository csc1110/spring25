package wk4.sectionb;

public class StringReplace {
    public static void main(String[] args) {
        String msg = "Hello";

        for(int i = 0; i<msg.length(); i++){
            if(msg.charAt(i) == 'l'){
                System.out.println("*");
            } else {
                System.out.println(msg.charAt(i));
            }
        }
    }
}
