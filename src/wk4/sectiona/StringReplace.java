package wk4.sectiona;

public class StringReplace {
    public static void main(String[] args) {
        String msg = "Hello";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<msg.length(); i++){
            if(msg.charAt(i) == 'l') {
                //System.out.println("*");
                sb.append("*");
            } else {
                //System.out.println(msg.charAt(i));
                sb.append(msg.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
