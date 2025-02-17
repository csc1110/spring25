package wk4.sectiona;

public class IndexOfExample {
    public static void main(String[] args) {
        String msg = "Hellosdlkfjdsl;kfjds;lfkjdslfjdsflkjfdslkjfdslkjfdslkjfdslkjfsdlkfjsdljldskjfldsfjsdlfjdslfkj";
        //String date = "03/01/1987";
        char target = 'l';
        int index = -1;

        for(int i = 0;i < msg.length() && index == -1; i++) {
            char letter = msg.charAt(i);
            if(letter == target ){
                index = i;
            }
        }
        System.out.println("Then index is "+index);


    }
}
